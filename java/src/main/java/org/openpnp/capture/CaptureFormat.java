package org.openpnp.capture;

import java.util.Arrays;
import java.util.List;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

/**
 * <i>native declaration : /Users/jason/Projects/openpnp/openpnp-capture/include/openpnp-capture.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CaptureFormat extends Structure {
    public int fps;
    public int fourcc;
    public int width;
    public int height;
    
    public CaptureFormat() {
        super();
    }
    
    protected List<String> getFieldOrder() {
        return Arrays.asList("fps", "fourcc", "width", "height");
    }
    
    public CaptureFormat(int fps, int fourcc, int width, int height) {
        super();
        this.fps = fps;
        this.fourcc = fourcc;
        this.width = width;
        this.height = height;
    }
    
    public CaptureFormat(Pointer peer) {
        super(peer);
    }
    
    public static class ByReference extends CaptureFormat implements Structure.ByReference {
        
    };
    
    public static class ByValue extends CaptureFormat implements Structure.ByValue {
        
    };
    
    public String getFourCcString() {
        return "" 
                + ((char) ((fourcc >> 24) & 0xff)) 
                + ((char) ((fourcc >> 16) & 0xff)) 
                + ((char) ((fourcc >> 8) & 0xff)) 
                + ((char) ((fourcc >> 0) & 0xff));
    }
    
    public String toString() {
        return String.format("fps %d, fourcc %d (%s), width %d, height %d", fps, fourcc, getFourCcString(), width, height);
    }
}
