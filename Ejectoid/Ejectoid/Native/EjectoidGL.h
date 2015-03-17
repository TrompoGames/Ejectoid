//
//  EjectoidGL.h
//  Ejectoid
//
//  Created by Dario Segura on 2015-03-17.
//  Copyright (c) 2015 Trompo Games Inc. All rights reserved.
//

#ifndef Ejectoid_EjectoidGL_h
#define Ejectoid_EjectoidGL_h

#include <GLES2/gl2.h>
#include <GLES2/gl2ext.h>

#ifdef __cplusplus
extern "C" {
#endif
    
    extern bool setupGraphics(int w, int h);
    extern void renderFrame();
    extern void printGLString(const char *name, GLenum s);
    extern void checkGlError(const char* op);
    extern GLuint createProgram(const char* pVertexSource, const char* pFragmentSource);
    
#ifdef __cplusplus
}
#endif

#endif
