//Taken from glsl.heroku.com
//I am assuming these are public domain and I can use them.
//I have made my best effort to research the origin and license.
//If this is incorrect or you don't want me using them, let me know.

#ifdef GL_ES
precision mediump float;
#endif

// just a basic template - @dist
// + fun

uniform float time;
uniform vec2 mouse;
uniform vec2 resolution;
uniform sampler2D backbuffer;

void main( void ) {
	vec2 position = ( gl_FragCoord.xy / resolution.xy );
	vec2 positionn = ( position - vec2(0.5)) / vec2(resolution.y/resolution.x,1.0)*2.0;
	float dist = distance(vec2(0.0), positionn);
	float dist2 = float(int(dist*10.0))/10.0; // 10 steps in 1.
	float angle = atan(positionn.y, positionn.x);

	float value;
	value = abs(2.0-dist2) * abs(sin(sin(dist2*time*-8.)+2.*time*(1.0+dist2)+angle*3.));
	vec3 color = pow(value, 3.0) * vec3(0.4,0.0,0.7) * 0.4;
	
	gl_FragColor = vec4( color, 1.0 );

}