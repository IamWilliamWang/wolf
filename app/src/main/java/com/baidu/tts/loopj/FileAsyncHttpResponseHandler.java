package com.baidu.tts.loopj;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URI;
import org.apache.http.Header;
import org.apache.http.HttpEntity;

public abstract class FileAsyncHttpResponseHandler extends AsyncHttpResponseHandler
{
  private static final String LOG_TAG = "FileAsyncHttpRH";
  protected final boolean append;
  protected final File file;
  protected File frontendFile;
  protected final boolean renameIfExists;

  public FileAsyncHttpResponseHandler(Context paramContext)
  {
    this.file = getTemporaryFile(paramContext);
    this.append = false;
    this.renameIfExists = false;
  }

  public FileAsyncHttpResponseHandler(File paramFile)
  {
    this(paramFile, false);
  }

  public FileAsyncHttpResponseHandler(File paramFile, boolean paramBoolean)
  {
    this(paramFile, paramBoolean, false);
  }

  public FileAsyncHttpResponseHandler(File paramFile, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramFile != null);
    for (boolean bool = true; ; bool = false)
    {
      Utils.asserts(bool, "File passed into FileAsyncHttpResponseHandler constructor must not be null");
      if ((!paramFile.isDirectory()) && (!paramFile.getParentFile().isDirectory()))
        Utils.asserts(paramFile.getParentFile().mkdirs(), "Cannot create parent directories for requested File location");
      if ((paramFile.isDirectory()) && (!paramFile.mkdirs()))
        AsyncHttpClient.log.d("FileAsyncHttpRH", "Cannot create directories for requested Directory location, might not be a problem");
      this.file = paramFile;
      this.append = paramBoolean1;
      this.renameIfExists = paramBoolean2;
      return;
    }
  }

  public boolean deleteTargetFile()
  {
    return (getTargetFile() != null) && (getTargetFile().delete());
  }

  protected File getOriginalFile()
  {
    if (this.file != null);
    for (boolean bool = true; ; bool = false)
    {
      Utils.asserts(bool, "Target file is null, fatal!");
      return this.file;
    }
  }

  protected byte[] getResponseData(HttpEntity paramHttpEntity)
  {
    int i = 0;
    if (paramHttpEntity != null)
    {
      InputStream localInputStream = paramHttpEntity.getContent();
      long l = paramHttpEntity.getContentLength();
      paramHttpEntity = new FileOutputStream(getTargetFile(), this.append);
      if (localInputStream != null)
      {
        try
        {
          byte[] arrayOfByte = new byte[4096];
          while (true)
          {
            int j = localInputStream.read(arrayOfByte);
            if ((j == -1) || (Thread.currentThread().isInterrupted()))
              break;
            i += j;
            paramHttpEntity.write(arrayOfByte, 0, j);
            sendProgressMessage(i, l);
          }
        }
        finally
        {
          AsyncHttpClient.silentCloseInputStream(localInputStream);
          paramHttpEntity.flush();
          AsyncHttpClient.silentCloseOutputStream(paramHttpEntity);
        }
        AsyncHttpClient.silentCloseInputStream(localInputStream);
        paramHttpEntity.flush();
        AsyncHttpClient.silentCloseOutputStream(paramHttpEntity);
      }
    }
    return null;
  }

  public File getTargetFile()
  {
    if (this.frontendFile == null)
      if (!getOriginalFile().isDirectory())
        break label32;
    label32: for (File localFile = getTargetFileByParsingURL(); ; localFile = getOriginalFile())
    {
      this.frontendFile = localFile;
      return this.frontendFile;
    }
  }

  protected File getTargetFileByParsingURL()
  {
    Utils.asserts(getOriginalFile().isDirectory(), "Target file is not a directory, cannot proceed");
    boolean bool;
    Object localObject;
    String str;
    File localFile;
    label120: int i;
    if (getRequestURI() != null)
    {
      bool = true;
      Utils.asserts(bool, "RequestURI is null, cannot proceed");
      localObject = getRequestURI().toString();
      str = ((String)localObject).substring(((String)localObject).lastIndexOf('/') + 1, ((String)localObject).length());
      localFile = new File(getOriginalFile(), str);
      localObject = localFile;
      if (localFile.exists())
      {
        localObject = localFile;
        if (this.renameIfExists)
        {
          if (str.contains("."))
            break label168;
          localObject = str + " (%d)";
          i = 0;
        }
      }
    }
    while (true)
    {
      localFile = new File(getOriginalFile(), String.format((String)localObject, new Object[] { Integer.valueOf(i) }));
      if (!localFile.exists())
      {
        localObject = localFile;
        return localObject;
        bool = false;
        break;
        label168: localObject = str.substring(0, str.lastIndexOf('.')) + " (%d)" + str.substring(str.lastIndexOf('.'), str.length());
        break label120;
      }
      i += 1;
    }
  }

  protected File getTemporaryFile(Context paramContext)
  {
    boolean bool;
    if (paramContext != null)
      bool = true;
    while (true)
    {
      Utils.asserts(bool, "Tried creating temporary file without having Context");
      try
      {
        paramContext = File.createTempFile("temp_", "_handled", paramContext.getCacheDir());
        return paramContext;
        bool = false;
      }
      catch (java.io.IOException paramContext)
      {
        AsyncHttpClient.log.e("FileAsyncHttpRH", "Cannot create temporary file", paramContext);
      }
    }
    return null;
  }

  public native abstract void onFailure(int paramInt, Header[] paramArrayOfHeader, Throwable paramThrowable, File paramFile);

  public final void onFailure(int paramInt, Header[] paramArrayOfHeader, byte[] paramArrayOfByte, Throwable paramThrowable)
  {
    onFailure(paramInt, paramArrayOfHeader, paramThrowable, getTargetFile());
  }

  public native abstract void onSuccess(int paramInt, Header[] paramArrayOfHeader, File paramFile);

  public final void onSuccess(int paramInt, Header[] paramArrayOfHeader, byte[] paramArrayOfByte)
  {
    onSuccess(paramInt, paramArrayOfHeader, getTargetFile());
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.loopj.FileAsyncHttpResponseHandler
 * JD-Core Version:    0.6.0
 */