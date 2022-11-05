//Taken from glsl.heroku.com
//I am assuming these are public domain and I can use them.
//I have made my best effort to research the origin and license.
//If this is incorrect or you don't want me using them, let me know.

#ifdef GL_ES
precision mediump float;
#endif

// Posted by Trisomie21

uniform float time;
uniform vec2 mouse;
uniform vec2 resolution;

#define LAYERS 6.0

float rand(vec2 co){ return fract(sin(dot(co.xy ,vec2(12.9898,78.233))) * 43758.5453); }

void main( void ) {
	
	vec2 pos = gl_FragCoord.xy - resolution.xy*.5;
	float dist = length(pos) / resolution.y;
	vec2 coord = vec2(dist, atan(pos.x, pos.y) / (3.1416*2.0));
	
	vec3 color = vec3(0.0);
	for (float i = 0.0; i < LAYERS; ++i)
	{
		float t = time*(1.0+i*i);
		
		vec2 uv = coord*(i+1.0);
		
		float r = pow(uv.x, .1) - (t*.01);

		vec2 p = vec2(r, uv.y*.5);
		
		// UV coord in cell
		uv.x = mod(r, 0.01)/.01;
		uv.y = mod(uv.y, 0.02)/.02;
	
		// Shape
		float a = 1.0-length(uv*2.0-1.0);
	
		// Color
		vec3 m = fract(r*200.0 * vec3(.5, 1.0, -.25)*0.5)+i*.2;
		
		// Mask cell
		p = floor(p*100.0);
		float d = (rand(p)-0.8)*10.0;
		d = clamp(d*dist, 0.0, 1.0);
	
		color = max(color, a*m*d);
	}

	gl_FragColor =  vec4(color, 1.0 );
}