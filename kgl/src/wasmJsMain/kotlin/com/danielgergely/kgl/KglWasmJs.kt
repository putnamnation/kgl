package com.danielgergely.kgl

import org.khronos.webgl.*

public class KglWasmJs(private val gl: WebGLRenderingContext) : Kgl {

    public override fun createShader(type: Int): Shader? = gl.createShader(type)

    public override fun shaderSource(shaderId: Shader, source: String): Unit =
        gl.shaderSource(shaderId as WebGLShader, source)

    public override fun compileShader(shaderId: Shader): Unit = gl.compileShader(shaderId as WebGLShader)
    public override fun deleteShader(shaderId: Shader): Unit = gl.deleteShader(shaderId as WebGLShader)

    public override fun getShaderParameter(shader: Shader, pname: Int): Int {
        val value = gl.getShaderParameter(shader as WebGLShader, pname)!!

        if (value is JsBoolean) {
            return if (value.toBoolean()) GL_TRUE else GL_FALSE
        }
        return (value as JsNumber).toInt()
    }

    public override fun getProgramInfoLog(program: Program): String? =
        gl.getProgramInfoLog(program as WebGLProgram)

    public override fun getShaderInfoLog(shaderId: Shader): String? =
        gl.getShaderInfoLog(shaderId as WebGLShader)

    public override fun getProgramParameter(program: Program, pname: Int): Int {
        val value = gl.getProgramParameter(program as WebGLProgram, pname)!!

        if (value is JsBoolean) {
            return if (value.toBoolean()) GL_TRUE else GL_FALSE
        }
        return (value as JsNumber).toInt()
    }

    public override fun createProgram(): Program? = gl.createProgram()
    public override fun attachShader(programId: Program, shaderId: Shader): Unit =
        gl.attachShader(programId as WebGLProgram, shaderId as WebGLShader)

    public override fun linkProgram(programId: Program): Unit = gl.linkProgram(programId as WebGLProgram)
    public override fun useProgram(programId: Program): Unit = gl.useProgram(programId as WebGLProgram)

    public override fun detachShader(programId: Program, shaderId: Shader): Unit =
        gl.detachShader(programId as WebGLProgram, shaderId as WebGLShader)

    public override fun deleteProgram(programId: Program): Unit = gl.deleteProgram(programId as WebGLProgram)

    public override fun getUniformLocation(programId: Program, name: String): UniformLocation? =
        gl.getUniformLocation(programId as WebGLProgram, name)

    public override fun getAttribLocation(programId: Program, name: String): Int =
        gl.getAttribLocation(programId as WebGLProgram, name)

    public override fun bindAttribLocation(programId: Program, index: Int, name: String): Unit =
        gl.bindAttribLocation(programId as WebGLProgram, index, name)

    public override fun enableVertexAttribArray(location: Int): Unit = gl.enableVertexAttribArray(location)
    public override fun disableVertexAttribArray(location: Int): Unit = gl.disableVertexAttribArray(location)

    public override fun enable(cap: Int): Unit = gl.enable(cap)
    public override fun disable(cap: Int): Unit = gl.disable(cap)

    public override fun createBuffer(): GlBuffer = gl.createBuffer() ?: throw Exception()
    public override fun createBuffers(count: Int): Array<GlBuffer> =
        Array(count) { gl.createBuffer() ?: throw Exception() }

    public override fun bindBuffer(target: Int, bufferId: GlBuffer?): Unit =
        gl.bindBuffer(target, bufferId as WebGLBuffer)

    public override fun bufferData(target: Int, sourceData: Buffer, size: Int, usage: Int) {
        gl.bufferData(target, sourceData.getWasmJsBufferWithOffset(), usage)
    }

    public override fun deleteBuffer(buffer: GlBuffer): Unit = gl.deleteBuffer(buffer as WebGLBuffer)

    public override fun vertexAttribPointer(
        location: Int,
        size: Int,
        type: Int,
        normalized: Boolean,
        stride: Int,
        offset: Int
    ): Unit = gl.vertexAttribPointer(location, size, type, normalized, stride, offset)

    public override fun uniform1f(location: UniformLocation, f: Float): Unit =
        gl.uniform1f(location as WebGLUniformLocation, f)
    public override fun uniform1fv(location: UniformLocation, value: FloatArray): Unit =
        gl.uniform1fv(location as WebGLUniformLocation, value.toFloat32Array())
    public override fun uniform1i(location: UniformLocation, i: Int): Unit =
        gl.uniform1i(location as WebGLUniformLocation, i)
    public override fun uniform1iv(location: UniformLocation, value: IntArray): Unit =
        gl.uniform1iv(location as WebGLUniformLocation, value.toInt32Array())

    public override fun uniform2f(location: UniformLocation, x: Float, y: Float): Unit =
        gl.uniform2f(location as WebGLUniformLocation, x, y)
    public override fun uniform2fv(location: UniformLocation, value: FloatArray): Unit =
        gl.uniform2fv(location as WebGLUniformLocation, value.toFloat32Array())
    public override fun uniform2i(location: UniformLocation, x: Int, y: Int): Unit =
        gl.uniform2i(location as WebGLUniformLocation, x, y)
    public override fun uniform2iv(location: UniformLocation, value: IntArray): Unit =
        gl.uniform2iv(location as WebGLUniformLocation, value.toInt32Array())

    public override fun uniform3f(location: UniformLocation, x: Float, y: Float, z: Float): Unit =
        gl.uniform3f(location as WebGLUniformLocation, x, y, z)
    public override fun uniform3fv(location: UniformLocation, value: FloatArray): Unit =
        gl.uniform3fv(location as WebGLUniformLocation, value.toFloat32Array())
    public override fun uniform3i(location: UniformLocation, x: Int, y: Int, z: Int): Unit =
        gl.uniform3i(location as WebGLUniformLocation, x, y, z)
    public override fun uniform3iv(location: UniformLocation, value: IntArray): Unit =
        gl.uniform3iv(location as WebGLUniformLocation, value.toInt32Array())

    public override fun uniform4f(location: UniformLocation, x: Float, y: Float, z: Float, w: Float): Unit =
        gl.uniform4f(location as WebGLUniformLocation, x, y, z, w)
    public override fun uniform4fv(location: UniformLocation, value: FloatArray): Unit =
        gl.uniform4fv(location as WebGLUniformLocation, value.toFloat32Array())
    public override fun uniform4i(location: UniformLocation, x: Int, y: Int, z: Int, w: Int): Unit =
        gl.uniform4i(location as WebGLUniformLocation, x, y, z, w)
    public override fun uniform4iv(location: UniformLocation, value: IntArray): Unit =
        gl.uniform4iv(location as WebGLUniformLocation, value.toInt32Array())

    override fun uniformMatrix3fv(location: UniformLocation, transpose: Boolean, value: FloatArray) {
        gl.uniformMatrix3fv(location as WebGLUniformLocation, transpose, value.toFloat32Array())
    }

    override fun uniformMatrix4fv(location: UniformLocation, transpose: Boolean, value: FloatArray) {
        gl.uniformMatrix4fv(location as WebGLUniformLocation, transpose, value.toFloat32Array())
    }

    public override fun viewport(x: Int, y: Int, width: Int, height: Int): Unit = gl.viewport(x, y, width, height)
    public override fun clear(mask: Int): Unit = gl.clear(mask)
    public override fun clearColor(r: Float, g: Float, b: Float, a: Float): Unit = gl.clearColor(r, g, b, a)

    public override fun blendFunc(sFactor: Int, dFactor: Int): Unit = gl.blendFunc(sFactor, dFactor)
    public override fun cullFace(mode: Int): Unit = gl.cullFace(mode)

    public override fun createTexture(): Texture = gl.createTexture() ?: throw Exception()
    public override fun createTextures(n: Int): Array<Texture> = Array(n) { gl.createTexture() ?: throw Exception() }
    public override fun deleteTexture(texture: Texture): Unit = gl.deleteTexture(texture as WebGLTexture)
    public override fun texImage2D(
        target: Int,
        level: Int,
        internalFormat: Int,
        border: Int,
        resource: TextureResource
    ): Unit = gl.texImage2D(target, level, internalFormat, GL_RGBA, GL_UNSIGNED_BYTE, resource.image)

    override fun texImage2D(
        target: Int,
        level: Int,
        internalFormat: Int,
        width: Int,
        height: Int,
        border: Int,
        format: Int,
        type: Int,
        buffer: Buffer?
    ) {
        gl.texImage2D(
            target,
            level,
            internalFormat,
            width,
            height,
            border,
            format,
            type,
            buffer?.getWasmJsBufferWithOffset()
        )
    }

    public override fun activeTexture(texture: Int): Unit = gl.activeTexture(texture)
    public override fun bindTexture(target: Int, texture: Texture?): Unit =
        gl.bindTexture(target, texture as WebGLTexture)

    public override fun generateMipmap(target: Int): Unit = gl.generateMipmap(target)
    public override fun texParameteri(target: Int, pname: Int, value: Int): Unit =
        gl.texParameteri(target, pname, value)

    public override fun createVertexArray(): VertexArrayObject =
        (gl as WebGL2RenderingContext).createVertexArray() ?: throw Exception()

    public override fun bindVertexArray(vertexArrayObject: VertexArrayObject?): Unit =
        (gl as WebGL2RenderingContext).bindVertexArray(vertexArrayObject as WebGLVertexArrayObject)

    public override fun deleteVertexArray(vertexArrayObject: VertexArrayObject): Unit =
        (gl as WebGL2RenderingContext).deleteVertexArray(vertexArrayObject as WebGLVertexArrayObject)

    public override fun drawArrays(mode: Int, first: Int, count: Int): Unit = gl.drawArrays(mode, first, count)

    public override fun drawElements(mode: Int, count: Int, type: Int): Unit = gl.drawElements(mode, count, type, 0)

    public override fun getError(): Int = gl.getError()
    public override fun finish(): Unit = gl.finish()

    public override fun bindFramebuffer(target: Int, framebuffer: Framebuffer?): Unit =
        gl.bindFramebuffer(target, framebuffer as WebGLFramebuffer)

    public override fun createFramebuffer(): Framebuffer = gl.createFramebuffer() ?: throw Exception()
    public override fun deleteFramebuffer(framebuffer: Framebuffer): Unit =
        gl.deleteFramebuffer(framebuffer as WebGLFramebuffer)

    public override fun checkFramebufferStatus(target: Int): Int = gl.checkFramebufferStatus(target)
    public override fun framebufferTexture2D(
        target: Int,
        attachment: Int,
        textarget: Int,
        texture: Texture,
        level: Int
    ): Unit = gl.framebufferTexture2D(target, attachment, textarget, texture as WebGLTexture, level)

    public override fun isFramebuffer(framebuffer: Framebuffer): Boolean =
        gl.isFramebuffer(framebuffer as WebGLFramebuffer)

    public override fun bindRenderbuffer(target: Int, renderbuffer: Renderbuffer?): Unit =
        gl.bindRenderbuffer(target, renderbuffer as WebGLRenderbuffer)

    public override fun createRenderbuffer(): Renderbuffer = gl.createRenderbuffer() ?: throw Exception()
    public override fun deleteRenderbuffer(renderbuffer: Renderbuffer): Unit =
        gl.deleteRenderbuffer(renderbuffer as WebGLRenderbuffer)

    public override fun framebufferRenderbuffer(
        target: Int,
        attachment: Int,
        renderbuffertarget: Int,
        renderbuffer: Renderbuffer
    ): Unit =
        gl.framebufferRenderbuffer(target, attachment, renderbuffertarget, renderbuffer as WebGLRenderbuffer)

    public override fun isRenderbuffer(renderbuffer: Renderbuffer): Boolean =
        gl.isRenderbuffer(renderbuffer as WebGLRenderbuffer)

    public override fun renderbufferStorage(target: Int, internalformat: Int, width: Int, height: Int): Unit =
        gl.renderbufferStorage(target, internalformat, width, height)

    public override fun readPixels(
        x: Int,
        y: Int,
        width: Int,
        height: Int,
        format: Int,
        type: Int,
        buffer: Buffer
    ) {
        gl.readPixels(x, y, width, height, format, type, buffer.getWasmJsBufferWithOffset())
    }

    override fun lineWidth(width: Float) {
        gl.lineWidth(width)
    }
}
