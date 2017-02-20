package com.baidu.tts.tools;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class FileTools
{
  public static void createDir(String paramString)
  {
    new File(paramString).mkdirs();
  }

  public static File createFile(String paramString)
  {
    return getFile(paramString);
  }

  public static File createFile(String paramString1, String paramString2)
  {
    return getFile(jointPathAndName(paramString1, paramString2));
  }

  public static boolean deleteFile(File paramFile)
  {
    return (!paramFile.exists()) || (paramFile.delete());
  }

  public static boolean deleteFile(String paramString)
  {
    return deleteFile(createFile(paramString));
  }

  public static String extractFileName(String paramString)
  {
    return paramString.substring(paramString.lastIndexOf(File.separator) + 1);
  }

  public static boolean fileCopy(File paramFile1, File paramFile2)
  {
    return fileCopy(new FileInputStream(paramFile1), new FileOutputStream(paramFile2));
  }

  public static boolean fileCopy(FileDescriptor paramFileDescriptor1, FileDescriptor paramFileDescriptor2)
  {
    return fileCopy(new FileInputStream(paramFileDescriptor1), new FileOutputStream(paramFileDescriptor2));
  }

  // ERROR //
  public static boolean fileCopy(FileInputStream paramFileInputStream, FileOutputStream paramFileOutputStream)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 84	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   4: aload_1
    //   5: invokevirtual 85	java/io/FileOutputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   8: invokestatic 88	com/baidu/tts/tools/FileTools:fileCopy	(Ljava/nio/channels/FileChannel;Ljava/nio/channels/FileChannel;)Z
    //   11: istore_2
    //   12: aload_0
    //   13: invokevirtual 91	java/io/FileInputStream:close	()V
    //   16: aload_1
    //   17: invokevirtual 92	java/io/FileOutputStream:close	()V
    //   20: iload_2
    //   21: ireturn
    //   22: astore_0
    //   23: aload_0
    //   24: invokevirtual 95	java/io/IOException:printStackTrace	()V
    //   27: iload_2
    //   28: ireturn
    //   29: astore_3
    //   30: aload_0
    //   31: invokevirtual 91	java/io/FileInputStream:close	()V
    //   34: aload_1
    //   35: invokevirtual 92	java/io/FileOutputStream:close	()V
    //   38: iconst_0
    //   39: ireturn
    //   40: astore_0
    //   41: aload_0
    //   42: invokevirtual 95	java/io/IOException:printStackTrace	()V
    //   45: iconst_0
    //   46: ireturn
    //   47: astore_3
    //   48: aload_0
    //   49: invokevirtual 91	java/io/FileInputStream:close	()V
    //   52: aload_1
    //   53: invokevirtual 92	java/io/FileOutputStream:close	()V
    //   56: aload_3
    //   57: athrow
    //   58: astore_0
    //   59: aload_0
    //   60: invokevirtual 95	java/io/IOException:printStackTrace	()V
    //   63: goto -7 -> 56
    //
    // Exception table:
    //   from	to	target	type
    //   12	20	22	java/io/IOException
    //   0	12	29	java/lang/Exception
    //   30	38	40	java/io/IOException
    //   0	12	47	finally
    //   48	56	58	java/io/IOException
  }

  public static boolean fileCopy(String paramString1, String paramString2)
  {
    return fileCopy(createFile(paramString1), createFile(paramString2));
  }

  public static boolean fileCopy(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    return fileCopy(createFile(paramString1, paramString2), createFile(paramString3, paramString4));
  }

  public static boolean fileCopy(FileChannel paramFileChannel1, FileChannel paramFileChannel2)
  {
    try
    {
      paramFileChannel1.transferTo(0L, paramFileChannel1.size(), paramFileChannel2);
      try
      {
        paramFileChannel1.close();
        paramFileChannel2.close();
        return true;
      }
      catch (IOException paramFileChannel1)
      {
        paramFileChannel1.printStackTrace();
        return false;
      }
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
      try
      {
        paramFileChannel1.close();
        paramFileChannel2.close();
        return true;
      }
      catch (IOException paramFileChannel1)
      {
        paramFileChannel1.printStackTrace();
        return false;
      }
    }
    finally
    {
      try
      {
        paramFileChannel1.close();
        paramFileChannel2.close();
        return true;
      }
      catch (IOException paramFileChannel1)
      {
        paramFileChannel1.printStackTrace();
      }
    }
    return false;
  }

  public static File getFile(String paramString)
  {
    File localFile = new File(paramString);
    while (true)
    {
      if ((!localFile.exists()) || (!localFile.exists()));
      try
      {
        localFile.createNewFile();
        return localFile;
        if (paramString.endsWith(File.separator))
        {
          localFile.mkdirs();
          continue;
        }
        paramString = new File(paramString.substring(0, paramString.lastIndexOf(File.separator)));
        if (paramString.exists())
          continue;
        paramString.mkdirs();
      }
      catch (IOException paramString)
      {
        paramString.printStackTrace();
      }
    }
    return localFile;
  }

  public static File getFile(String paramString1, String paramString2)
  {
    return getFile(jointPathAndName(paramString1, paramString2));
  }

  public static boolean isFileExist(String paramString)
  {
    return new File(paramString).exists();
  }

  public static boolean isFileExist(Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject.length == 1)
    {
      paramArrayOfObject = paramArrayOfObject[0];
      if ((paramArrayOfObject instanceof File))
        paramArrayOfObject = (File)paramArrayOfObject;
    }
    while (true)
    {
      if (paramArrayOfObject != null)
      {
        return paramArrayOfObject.exists();
        if ((paramArrayOfObject instanceof String))
        {
          paramArrayOfObject = createFile((String)paramArrayOfObject);
          continue;
          if (paramArrayOfObject.length == 2)
          {
            paramArrayOfObject = createFile((String)paramArrayOfObject[0], (String)paramArrayOfObject[1]);
            continue;
          }
          throw new UnknownError();
        }
      }
      else
      {
        return false;
      }
      paramArrayOfObject = null;
    }
  }

  public static String jointPathAndName(String paramString1, String paramString2)
  {
    if (paramString1.endsWith(File.separator))
      return paramString1 + paramString2;
    return paramString1 + File.separator + paramString2;
  }

  public static boolean writeFile(String paramString, File paramFile)
  {
    try
    {
      if (paramFile.exists());
      while (true)
      {
        paramFile = new FileWriter(paramFile, false);
        paramFile.write(paramString);
        paramFile.flush();
        paramFile.close();
        return true;
        paramFile.createNewFile();
      }
    }
    catch (IOException paramString)
    {
      paramString.printStackTrace();
    }
    return false;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.tools.FileTools
 * JD-Core Version:    0.6.0
 */