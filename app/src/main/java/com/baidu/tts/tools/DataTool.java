package com.baidu.tts.tools;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map<Ljava.lang.String;Ljava.lang.String;>;
import java.util.Set;

public class DataTool
{
  // ERROR //
  public static String[] connect(String[] paramArrayOfString, String[][] paramArrayOfString1)
  {
    // Byte code:
    //   0: aload_0
    //   1: astore 6
    //   3: aload_0
    //   4: ifnonnull +9 -> 13
    //   7: iconst_0
    //   8: anewarray 15	java/lang/String
    //   11: astore 6
    //   13: aload 6
    //   15: arraylength
    //   16: istore_3
    //   17: aload_1
    //   18: arraylength
    //   19: istore 4
    //   21: iconst_0
    //   22: istore_2
    //   23: iload_2
    //   24: iload 4
    //   26: if_icmpge +23 -> 49
    //   29: aload_1
    //   30: iload_2
    //   31: aaload
    //   32: astore_0
    //   33: aload_0
    //   34: arraylength
    //   35: istore 5
    //   37: iload_3
    //   38: iload 5
    //   40: iadd
    //   41: istore_3
    //   42: iload_2
    //   43: iconst_1
    //   44: iadd
    //   45: istore_2
    //   46: goto -23 -> 23
    //   49: aload 6
    //   51: iload_3
    //   52: invokestatic 21	java/util/Arrays:copyOf	([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   55: checkcast 23	[Ljava/lang/String;
    //   58: astore_0
    //   59: aload 6
    //   61: arraylength
    //   62: istore_3
    //   63: aload_1
    //   64: arraylength
    //   65: istore 4
    //   67: iconst_0
    //   68: istore_2
    //   69: iload_2
    //   70: iload 4
    //   72: if_icmpge +40 -> 112
    //   75: aload_1
    //   76: iload_2
    //   77: aaload
    //   78: astore 6
    //   80: aload 6
    //   82: iconst_0
    //   83: aload_0
    //   84: iload_3
    //   85: aload 6
    //   87: arraylength
    //   88: invokestatic 29	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   91: aload 6
    //   93: arraylength
    //   94: istore 5
    //   96: iload_3
    //   97: iload 5
    //   99: iadd
    //   100: istore_3
    //   101: iload_2
    //   102: iconst_1
    //   103: iadd
    //   104: istore_2
    //   105: goto -36 -> 69
    //   108: astore_0
    //   109: goto -67 -> 42
    //   112: aload_0
    //   113: areturn
    //   114: astore 6
    //   116: goto -15 -> 101
    //
    // Exception table:
    //   from	to	target	type
    //   33	37	108	java/lang/Exception
    //   80	96	114	java/lang/Exception
  }

  public static Set<String> copy(Set<String> paramSet)
  {
    if (paramSet == null)
      return null;
    HashSet localHashSet = new HashSet();
    paramSet = paramSet.iterator();
    while (paramSet.hasNext())
      localHashSet.add((String)paramSet.next());
    return localHashSet;
  }

  public static Set<String> fromArrayToSet(String[] paramArrayOfString)
  {
    if (paramArrayOfString != null)
    {
      HashSet localHashSet2 = new HashSet();
      int j = paramArrayOfString.length;
      int i = 0;
      while (true)
      {
        localHashSet1 = localHashSet2;
        if (i >= j)
          break;
        localHashSet2.add(paramArrayOfString[i]);
        i += 1;
      }
    }
    HashSet localHashSet1 = null;
    return localHashSet1;
  }

  public static String[] fromSetToArray(Set<String> paramSet)
  {
    if (paramSet != null)
    {
      String[] arrayOfString = new String[paramSet.size()];
      paramSet.toArray(arrayOfString);
      return arrayOfString;
    }
    return null;
  }

  public static String getMapInnerValue(Map<String, Map<String, String>> paramMap, String paramString1, String paramString2)
  {
    if (paramMap != null)
    {
      paramMap = (Map)paramMap.get(paramString1);
      if (paramMap != null)
        return (String)paramMap.get(paramString2);
      return null;
    }
    return null;
  }

  public static String getMapValue(Map<String, String> paramMap, String paramString)
  {
    if ((paramMap == null) || (paramMap.isEmpty()))
      return null;
    return (String)paramMap.get(paramString);
  }

  public static Map<String, Map<String, String>> getSuitItem(Map<String, Map<String, String>> paramMap, String paramString1, boolean paramBoolean, String paramString2)
  {
    if (isMapEmpty(paramMap))
      return null;
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      Map localMap = (Map)paramMap.get(str1);
      String str2 = (String)localMap.get(paramString1);
      if (paramBoolean)
      {
        if (!paramString2.equals(str2))
          continue;
        localHashMap.put(str1, localMap);
        continue;
      }
      if (paramString2.equals(str2))
        continue;
      localHashMap.put(str1, localMap);
    }
    return localHashMap;
  }

  public static Map<String, Integer> getSuitItem(Map<String, Integer> paramMap, boolean paramBoolean, int paramInt)
  {
    if (isMapEmpty(paramMap))
      return null;
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      int i = ((Integer)paramMap.get(str)).intValue();
      if (paramBoolean)
      {
        if (paramInt != i)
          continue;
        localHashMap.put(str, Integer.valueOf(i));
        continue;
      }
      if (paramInt == i)
        continue;
      localHashMap.put(str, Integer.valueOf(i));
    }
    return localHashMap;
  }

  public static <T extends List<?>> boolean isListEmpty(T paramT)
  {
    return (paramT == null) || (paramT.isEmpty());
  }

  public static boolean isLong(String paramString)
  {
    try
    {
      Long.parseLong(paramString);
      return true;
    }
    catch (java.lang.Exception paramString)
    {
    }
    return false;
  }

  public static <T extends Map<?, ?>> boolean isMapEmpty(T paramT)
  {
    return (paramT == null) || (paramT.isEmpty());
  }

  public static <T extends Set<?>> boolean isSetEmpty(T paramT)
  {
    return (paramT == null) || (paramT.isEmpty());
  }

  public static Map<String, String> putIfAbsent(Map<String, Map<String, String>> paramMap, String paramString)
  {
    Map localMap = (Map)paramMap.get(paramString);
    Object localObject = localMap;
    if (localMap == null)
    {
      localObject = new HashMap();
      paramMap.put(paramString, localObject);
    }
    return (Map<String, String>)localObject;
  }

  public static void putMapItem(Map<String, Map<String, String>> paramMap, String paramString, Map<String, String> paramMap1)
  {
    Map localMap = (Map)paramMap.get(paramString);
    if (localMap == null)
    {
      paramMap.put(paramString, paramMap1);
      return;
    }
    localMap.putAll(paramMap1);
  }

  public static void putMapValue(Map<String, Map<String, String>> paramMap, String paramString1, String paramString2, String paramString3)
  {
    putIfAbsent(paramMap, paramString1).put(paramString2, paramString3);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.tools.DataTool
 * JD-Core Version:    0.6.0
 */