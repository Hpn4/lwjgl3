/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import opengl.*
import core.linux.*

val GLX12 = "GLX12".nativeClassGLX("GLX12") {
    documentation = "Native bindings to GLX 1.2."

    Display_p(
        "GetCurrentDisplay",
        "Returns the display associated with the current context and drawable."
    )

}