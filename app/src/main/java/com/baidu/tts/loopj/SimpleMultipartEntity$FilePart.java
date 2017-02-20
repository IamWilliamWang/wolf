package com.baidu.tts.loopj;

import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

class SimpleMultipartEntity$FilePart
{
  public File file;
  public byte[] header;

  public SimpleMultipartEntity$FilePart(SimpleMultipartEntity paramSimpleMultipartEntity, String paramString1, File paramFile, String paramString2)
  {
    this.header = createHeader(paramString1, paramFile.getName(), paramString2);
    this.file = paramFile;
  }

  public SimpleMultipartEntity$FilePart(SimpleMultipartEntity paramSimpleMultipartEntity, String paramString1, File paramFile, String paramString2, String paramString3)
  {
    paramSimpleMultipartEntity = paramString3;
    if (TextUtils.isEmpty(paramString3))
      paramSimpleMultipartEntity = paramFile.getName();
    this.header = createHeader(paramString1, paramSimpleMultipartEntity, paramString2);
    this.file = paramFile;
  }

  private byte[] createHeader(String paramString1, String paramString2, String paramString3)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    try
    {
      localByteArrayOutputStream.write(SimpleMultipartEntity.access$000(this.this$0));
      localByteArrayOutputStream.write(SimpleMultipartEntity.access$100(this.this$0, paramString1, paramString2));
      localByteArrayOutputStream.write(SimpleMultipartEntity.access$200(this.this$0, paramString3));
      localByteArrayOutputStream.write(SimpleMultipartEntity.access$300());
      localByteArrayOutputStream.write(SimpleMultipartEntity.access$400());
      return localByteArrayOutputStream.toByteArray();
    }
    catch (java.io.IOException paramString1)
    {
      while (true)
        AsyncHttpClient.log.e("SimpleMultipartEntity", "createHeader ByteArrayOutputStream exception", paramString1);
    }
  }

  public long getTotalLength()
  {
    return this.file.length() + SimpleMultipartEntity.access$400().length + this.header.length;
  }

  public void writeTo(OutputStream paramOutputStream)
  {
    paramOutputStream.write(this.header);
    SimpleMultipartEntity.access$500(this.this$0, this.header.length);
    FileInputStream localFileInputStream = new FileInputStream(this.file);
    byte[] arrayOfByte = new byte[4096];
    while (true)
    {
      int i = localFileInputStream.read(arrayOfByte);
      if (i == -1)
        break;
      paramOutputStream.write(arrayOfByte, 0, i);
      SimpleMultipartEntity.access$500(this.this$0, i);
    }
    paramOutputStream.write(SimpleMultipartEntity.access$400());
    SimpleMultipartEntity.access$500(this.this$0, SimpleMultipartEntity.access$400().length);
    paramOutputStream.flush();
    AsyncHttpClient.silentCloseInputStream(localFileInputStream);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.loopj.SimpleMultipartEntity.FilePart
 * JD-Core Version:    0.6.0
 */