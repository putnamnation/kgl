package com.danielgergely.kgl

public class DebugKgl(
    private val kgl: Kgl,
    private val runBefore: (String) -> Unit,
    private val runAfter: (String, Kgl) -> Unit,
) : Kgl {

    override fun createShader(type: Int): Shader? {
        runBefore("createShader")
        val ret = kgl.createShader(type)
        runAfter("createShader", kgl)
        return ret
    }

    override fun shaderSource(shaderId: Shader, source: String) {
        runBefore("shaderSource")
        val ret = kgl.shaderSource(shaderId, source)
        runAfter("shaderSource", kgl)
        return ret
    }

    override fun compileShader(shaderId: Shader) {
        runBefore("compileShader")
        val ret = kgl.compileShader(shaderId)
        runAfter("compileShader", kgl)
        return ret
    }

    override fun deleteShader(shaderId: Shader) {
        runBefore("deleteShader")
        val ret = kgl.deleteShader(shaderId)
        runAfter("deleteShader", kgl)
        return ret
    }

    override fun getShaderParameter(shader: Shader, pname: Int): Int {
        runBefore("getShaderParameter")
        val ret = kgl.getShaderParameter(shader, pname)
        runAfter("getShaderParameter", kgl)
        return ret
    }

    override fun getProgramInfoLog(program: Program): String? {
        runBefore("getProgramInfoLog")
        val ret = kgl.getProgramInfoLog(program)
        runAfter("getProgramInfoLog", kgl)
        return ret
    }

    override fun getShaderInfoLog(shaderId: Shader): String? {
        runBefore("getShaderInfoLog")
        val ret = kgl.getShaderInfoLog(shaderId)
        runAfter("getShaderInfoLog", kgl)
        return ret
    }

    override fun createProgram(): Program? {
        runBefore("createProgram")
        val ret = kgl.createProgram()
        runAfter("createProgram", kgl)
        return ret
    }

    override fun attachShader(programId: Program, shaderId: Shader) {
        runBefore("attachShader")
        val ret = kgl.attachShader(programId, shaderId)
        runAfter("attachShader", kgl)
        return ret
    }

    override fun linkProgram(programId: Program) {
        runBefore("linkProgram")
        val ret = kgl.linkProgram(programId)
        runAfter("linkProgram", kgl)
        return ret
    }

    override fun useProgram(programId: Program) {
        runBefore("useProgram")
        val ret = kgl.useProgram(programId)
        runAfter("useProgram", kgl)
        return ret
    }

    override fun detachShader(programId: Program, shaderId: Shader) {
        runBefore("detachShader")
        val ret = kgl.detachShader(programId, shaderId)
        runAfter("detachShader", kgl)
        return ret
    }

    override fun deleteProgram(programId: Program) {
        runBefore("deleteProgram")
        val ret = kgl.deleteProgram(programId)
        runAfter("deleteProgram", kgl)
        return ret
    }

    override fun getProgramParameter(program: Program, pname: Int): Int {
        runBefore("getProgramParameter")
        val ret = kgl.getProgramParameter(program, pname)
        runAfter("getProgramParameter", kgl)
        return ret
    }

    override fun getUniformLocation(programId: Program, name: String): UniformLocation? {
        runBefore("getUniformLocation")
        val ret = kgl.getUniformLocation(programId, name)
        runAfter("getUniformLocation", kgl)
        return ret
    }

    override fun getAttribLocation(programId: Program, name: String): Int {
        runBefore("getAttribLocation")
        val ret = kgl.getAttribLocation(programId, name)
        runAfter("getAttribLocation", kgl)
        return ret
    }

    override fun bindAttribLocation(programId: Program, index: Int, name: String) {
        runBefore("bindAttribLocation")
        val ret = kgl.bindAttribLocation(programId, index, name)
        runAfter("bindAttribLocation", kgl)
        return ret
    }

    override fun enable(cap: Int) {
        runBefore("enable")
        val ret = kgl.enable(cap)
        runAfter("enable", kgl)
        return ret
    }

    override fun disable(cap: Int) {
        runBefore("disable")
        val ret = kgl.disable(cap)
        runAfter("disable", kgl)
        return ret
    }

    override fun enableVertexAttribArray(location: Int) {
        runBefore("enableVertexAttribArray")
        val ret = kgl.enableVertexAttribArray(location)
        runAfter("enableVertexAttribArray", kgl)
        return ret
    }

    override fun disableVertexAttribArray(location: Int) {
        runBefore("disableVertexAttribArray")
        val ret = kgl.disableVertexAttribArray(location)
        runAfter("disableVertexAttribArray", kgl)
        return ret
    }

    override fun createBuffer(): GlBuffer {
        runBefore("createBuffer")
        val ret = kgl.createBuffer()
        runAfter("createBuffer", kgl)
        return ret
    }

    override fun createBuffers(count: Int): Array<GlBuffer> {
        runBefore("createBuffers")
        val ret = kgl.createBuffers(count)
        runAfter("createBuffers", kgl)
        return ret
    }

    override fun bindBuffer(target: Int, bufferId: GlBuffer?) {
        runBefore("bindBuffer")
        val ret = kgl.bindBuffer(target, bufferId)
        runAfter("bindBuffer", kgl)
        return ret
    }

    override fun bufferData(target: Int, sourceData: Buffer, size: Int, usage: Int) {
        runBefore("bufferData")
        val ret = kgl.bufferData(target, sourceData, size, usage)
        runAfter("bufferData", kgl)
        return ret
    }

    override fun deleteBuffer(buffer: GlBuffer) {
        runBefore("deleteBuffer")
        val ret = kgl.deleteBuffer(buffer)
        runAfter("deleteBuffer", kgl)
        return ret
    }

    override fun vertexAttribPointer(
        location: Int,
        size: Int,
        type: Int,
        normalized: Boolean,
        stride: Int,
        offset: Int
    ) {
        runBefore("vertexAttribPointer")
        val ret = kgl.vertexAttribPointer(location, size, type, normalized, stride, offset)
        runAfter("vertexAttribPointer", kgl)
        return ret
    }

    override fun uniform1f(location: UniformLocation, f: Float) {
        runBefore("uniform1f")
        val ret = kgl.uniform1f(location, f)
        runAfter("uniform1f", kgl)
        return ret
    }

    override fun uniform1fv(location: UniformLocation, value: FloatArray) {
        runBefore("uniform1fv")
        val ret = kgl.uniform1fv(location, value)
        runAfter("uniform1fv", kgl)
        return ret
    }

    override fun uniform1i(location: UniformLocation, i: Int) {
        runBefore("uniform1i")
        val ret = kgl.uniform1i(location, i)
        runAfter("uniform1i", kgl)
        return ret
    }

    override fun uniform1iv(location: UniformLocation, value: IntArray) {
        runBefore("uniform1iv")
        val ret = kgl.uniform1iv(location, value)
        runAfter("uniform1iv", kgl)
        return ret
    }

    override fun uniform2f(location: UniformLocation, x: Float, y: Float) {
        runBefore("uniform2f")
        val ret = kgl.uniform2f(location, x, y)
        runAfter("uniform2f", kgl)
        return ret
    }

    override fun uniform2fv(location: UniformLocation, value: FloatArray) {
        runBefore("uniform2fv")
        val ret = kgl.uniform2fv(location, value)
        runAfter("uniform2fv", kgl)
        return ret
    }

    override fun uniform2i(location: UniformLocation, x: Int, y: Int) {
        runBefore("uniform2i")
        val ret = kgl.uniform2i(location, x, y)
        runAfter("uniform2i", kgl)
        return ret
    }

    override fun uniform2iv(location: UniformLocation, value: IntArray) {
        runBefore("uniform2iv")
        val ret = kgl.uniform2iv(location, value)
        runAfter("uniform2iv", kgl)
        return ret
    }

    override fun uniform3f(location: UniformLocation, x: Float, y: Float, z: Float) {
        runBefore("uniform3f")
        val ret = kgl.uniform3f(location, x, y, z)
        runAfter("uniform3f", kgl)
        return ret
    }

    override fun uniform3fv(location: UniformLocation, value: FloatArray) {
        runBefore("uniform3fv")
        val ret = kgl.uniform3fv(location, value)
        runAfter("uniform3fv", kgl)
        return ret
    }

    override fun uniform3i(location: UniformLocation, x: Int, y: Int, z: Int) {
        runBefore("uniform3i")
        val ret = kgl.uniform3i(location, x, y, z)
        runAfter("uniform3i", kgl)
        return ret
    }

    override fun uniform3iv(location: UniformLocation, value: IntArray) {
        runBefore("uniform3iv")
        val ret = kgl.uniform3iv(location, value)
        runAfter("uniform3iv", kgl)
        return ret
    }

    override fun uniform4f(location: UniformLocation, x: Float, y: Float, z: Float, w: Float) {
        runBefore("uniform4f")
        val ret = kgl.uniform4f(location, x, y, z, w)
        runAfter("uniform4f", kgl)
        return ret
    }

    override fun uniform4fv(location: UniformLocation, value: FloatArray) {
        runBefore("uniform4fv")
        val ret = kgl.uniform4fv(location, value)
        runAfter("uniform4fv", kgl)
        return ret
    }

    override fun uniform4i(location: UniformLocation, x: Int, y: Int, z: Int, w: Int) {
        runBefore("uniform4i")
        val ret = kgl.uniform4i(location, x, y, z, w)
        runAfter("uniform4i", kgl)
        return ret
    }

    override fun uniform4iv(location: UniformLocation, value: IntArray) {
        runBefore("uniform4iv")
        val ret = kgl.uniform4iv(location, value)
        runAfter("uniform4iv", kgl)
        return ret
    }

    override fun uniformMatrix3fv(location: UniformLocation, transpose: Boolean, value: FloatArray) {
        runBefore("uniformMatrix3fv")
        val ret = kgl.uniformMatrix3fv(location, transpose, value)
        runAfter("uniformMatrix3fv", kgl)
        return ret
    }

    override fun uniformMatrix4fv(location: UniformLocation, transpose: Boolean, value: FloatArray) {
        runBefore("uniformMatrix4fv")
        val ret = kgl.uniformMatrix4fv(location, transpose, value)
        runAfter("uniformMatrix4fv", kgl)
        return ret
    }

    override fun blendFunc(sFactor: Int, dFactor: Int) {
        runBefore("blendFunc")
        val ret = kgl.blendFunc(sFactor, dFactor)
        runAfter("blendFunc", kgl)
        return ret
    }

    override fun cullFace(mode: Int) {
        runBefore("cullFace")
        val ret = kgl.cullFace(mode)
        runAfter("cullFace", kgl)
        return ret
    }

    override fun viewport(x: Int, y: Int, width: Int, height: Int) {
        runBefore("viewport")
        val ret = kgl.viewport(x, y, width, height)
        runAfter("viewport", kgl)
        return ret
    }

    override fun clearColor(r: Float, g: Float, b: Float, a: Float) {
        runBefore("clearColor")
        val ret = kgl.clearColor(r, g, b, a)
        runAfter("clearColor", kgl)
        return ret
    }

    override fun clear(mask: Int) {
        runBefore("clear")
        val ret = kgl.clear(mask)
        runAfter("clear", kgl)
        return ret
    }

    override fun createTexture(): Texture {
        runBefore("createTexture")
        val ret = kgl.createTexture()
        runAfter("createTexture", kgl)
        return ret
    }

    override fun createTextures(n: Int): Array<Texture> {
        runBefore("createTextures")
        val ret = kgl.createTextures(n)
        runAfter("createTextures", kgl)
        return ret
    }

    override fun deleteTexture(texture: Texture) {
        runBefore("deleteTexture")
        val ret = kgl.deleteTexture(texture)
        runAfter("deleteTexture", kgl)
        return ret
    }

    override fun texImage2D(target: Int, level: Int, internalFormat: Int, border: Int, resource: TextureResource) {
        runBefore("texImage2D")
        val ret = kgl.texImage2D(target, level, internalFormat, border, resource)
        runAfter("texImage2D", kgl)
        return ret
    }

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
        runBefore("texImage2D")
        val ret = kgl.texImage2D(target, level, internalFormat, width, height, border, format, type, buffer)
        runAfter("texImage2D", kgl)
        return ret
    }

    override fun activeTexture(texture: Int) {
        runBefore("activeTexture")
        val ret = kgl.activeTexture(texture)
        runAfter("activeTexture", kgl)
        return ret
    }

    override fun bindTexture(target: Int, texture: Texture?) {
        runBefore("bindTexture")
        val ret = kgl.bindTexture(target, texture)
        runAfter("bindTexture", kgl)
        return ret
    }

    override fun generateMipmap(target: Int) {
        runBefore("generateMipmap")
        val ret = kgl.generateMipmap(target)
        runAfter("generateMipmap", kgl)
        return ret
    }

    override fun texParameteri(target: Int, pname: Int, value: Int) {
        runBefore("texParameteri")
        val ret = kgl.texParameteri(target, pname, value)
        runAfter("texParameteri", kgl)
        return ret
    }

    override fun createVertexArray(): VertexArrayObject {
        runBefore("createVertexArray")
        val ret = kgl.createVertexArray()
        runAfter("createVertexArray", kgl)
        return ret
    }

    override fun bindVertexArray(vertexArrayObject: VertexArrayObject?) {
        runBefore("bindVertexArray")
        val ret = kgl.bindVertexArray(vertexArrayObject)
        runAfter("bindVertexArray", kgl)
        return ret
    }

    override fun deleteVertexArray(vertexArrayObject: VertexArrayObject) {
        runBefore("deleteVertexArray")
        val ret = kgl.deleteVertexArray(vertexArrayObject)
        runAfter("deleteVertexArray", kgl)
        return ret
    }

    override fun drawArrays(mode: Int, first: Int, count: Int) {
        runBefore("drawArrays")
        val ret = kgl.drawArrays(mode, first, count)
        runAfter("drawArrays", kgl)
        return ret
    }

    override fun drawElements(mode: Int, count: Int, type: Int) {
        runBefore("drawElements")
        val ret = kgl.drawElements(mode, count, type)
        runAfter("drawElements", kgl)
        return ret
    }

    override fun getError(): Int {
        runBefore("getError")
        val ret = kgl.getError()
        runAfter("getError", kgl)
        return ret
    }

    override fun finish() {
        runBefore("finish")
        val ret = kgl.finish()
        runAfter("finish", kgl)
        return ret
    }

    override fun bindFramebuffer(target: Int, framebuffer: Framebuffer?) {
        runBefore("bindFramebuffer")
        val ret = kgl.bindFramebuffer(target, framebuffer)
        runAfter("bindFramebuffer", kgl)
        return ret
    }

    override fun createFramebuffer(): Framebuffer {
        runBefore("createFramebuffer")
        val ret = kgl.createFramebuffer()
        runAfter("createFramebuffer", kgl)
        return ret
    }

    override fun deleteFramebuffer(framebuffer: Framebuffer) {
        runBefore("deleteFramebuffer")
        val ret = kgl.deleteFramebuffer(framebuffer)
        runAfter("deleteFramebuffer", kgl)
        return ret
    }

    override fun checkFramebufferStatus(target: Int): Int {
        runBefore("checkFramebufferStatus")
        val ret = kgl.checkFramebufferStatus(target)
        runAfter("checkFramebufferStatus", kgl)
        return ret
    }

    override fun framebufferTexture2D(target: Int, attachment: Int, textarget: Int, texture: Texture, level: Int) {
        runBefore("framebufferTexture2D")
        val ret = kgl.framebufferTexture2D(target, attachment, textarget, texture, level)
        runAfter("framebufferTexture2D", kgl)
        return ret
    }

    override fun isFramebuffer(framebuffer: Framebuffer): Boolean {
        runBefore("isFramebuffer")
        val ret = kgl.isFramebuffer(framebuffer)
        runAfter("isFramebuffer", kgl)
        return ret
    }

    override fun bindRenderbuffer(target: Int, renderbuffer: Renderbuffer?) {
        runBefore("bindRenderbuffer")
        val ret = kgl.bindRenderbuffer(target, renderbuffer)
        runAfter("bindRenderbuffer", kgl)
        return ret
    }

    override fun createRenderbuffer(): Renderbuffer {
        runBefore("createRenderbuffer")
        val ret = kgl.createRenderbuffer()
        runAfter("createRenderbuffer", kgl)
        return ret
    }

    override fun deleteRenderbuffer(renderbuffer: Renderbuffer) {
        runBefore("deleteRenderbuffer")
        val ret = kgl.deleteRenderbuffer(renderbuffer)
        runAfter("deleteRenderbuffer", kgl)
        return ret
    }

    override fun framebufferRenderbuffer(
        target: Int,
        attachment: Int,
        renderbuffertarget: Int,
        renderbuffer: Renderbuffer
    ) {
        runBefore("framebufferRenderbuffer")
        val ret = kgl.framebufferRenderbuffer(target, attachment, renderbuffertarget, renderbuffer)
        runAfter("framebufferRenderbuffer", kgl)
        return ret
    }

    override fun isRenderbuffer(renderbuffer: Renderbuffer): Boolean {
        runBefore("isRenderbuffer")
        val ret = kgl.isRenderbuffer(renderbuffer)
        runAfter("isRenderbuffer", kgl)
        return ret
    }

    override fun renderbufferStorage(target: Int, internalformat: Int, width: Int, height: Int) {
        runBefore("renderbufferStorage")
        val ret = kgl.renderbufferStorage(target, internalformat, width, height)
        runAfter("renderbufferStorage", kgl)
        return ret
    }

    override fun readPixels(x: Int, y: Int, width: Int, height: Int, format: Int, type: Int, buffer: Buffer) {
        runBefore("readPixels")
        val ret = kgl.readPixels(x, y, width, height, format, type, buffer)
        runAfter("readPixels", kgl)
        return ret
    }

    override fun lineWidth(width: Float) {
        runBefore("lineWidth")
        val ret = kgl.lineWidth(width)
        runAfter("lineWidth", kgl)
        return ret
    }
}
