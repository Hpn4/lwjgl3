/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package nanovg

import org.lwjgl.generator.*
import opengl.*

val NVGLUframebuffer_p = struct(Module.NANOVG, "NVGLUFramebuffer", nativeName = "NVGLUframebuffer", mutable = false) {
    documentation = "A framebuffer object."

    GLuint.member("fbo", "the OpenGL framebuffer object handle")
    GLuint.member("rbo", "the OpenGL renderbuffer handle")
    GLuint.member("texture", "the OpenGL texture handle")
    int.member("image", "the NanoVG image handle")
}.p
