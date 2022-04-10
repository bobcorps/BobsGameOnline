//Taken from glsl.heroku.com
//I am assuming these are public domain and I can use them.
//I have made my best effort to research the origin and license.
//If this is incorrect or you don't want me using them, let me know.

#ifdef GL_ES
precision mediump float;
#endif

uniform float time;
uniform vec2 mouse;
uniform vec2 resolution;

// a raymarching experiment by kabuto
//fork by tigrou ind (2013.01.22)


const int MAXITER = 40;

vec3 field(vec3 p) {
	p *= .1;
	float f = .1;
	for (int i = 0; i < 3; i++) {
		p = p.yzx*mat3(.8,.6,0,-.6,.8,0,0,0,1);
		p += vec3(.123,.456,.789)*float(0.1*sin(time));
		p = abs(fract(p)-.5);
		p *= 2.0;
		f *= 2.0;
	}
	p *= p;
	return sqrt(p+p.yzx)/f-.05;
}

void main( void ) {
	vec3 dir = normalize(vec3((gl_FragCoord.xy-resolution*.5)/resolution.x,1.));
	float a = time * 0.1;
	vec3 pos = vec3(0.0,time*0.1,0.0);
	dir *= mat3(1,0,0,0,cos(a),-sin(a),0,sin(a),cos(a));
	dir *= mat3(cos(a),0,-sin(a),0,1,0,sin(a),0,cos(a));
	vec3 color = vec3(0);
	for (int i = 0; i < MAXITER; i++) {
		vec3 f2 = field(pos);
		float f = min(min(f2.x,f2.y),f2.z);
		
		pos += dir*f;
		color += float(MAXITER-i)/(f2+.01);
	}
	vec3 color3 = vec3(1.-1./(1.+color*(.09/float(MAXITER*MAXITER))));
	color3 *= color3;
	gl_FragColor = vec4(vec3(color3.r+color3.g+color3.b),1.);
}