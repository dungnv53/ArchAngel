import java.io.PrintStream;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

/** PrintStream
 * RecordStore
 * ... chac la xu ly saved game nhu SBF co addScore printScore
 * @author dung
 * RecordStore a = null
 * int b = 0 
 * bool c = false
 * byte[] d = null
 */
public class h
{
	/**
	 * a la recordstore
	 */
  private RecordStore a = null;
  /**
   * b int = 0
   */
  private int b = 0;
  /**
   * c bool false
   */
  private boolean c = false;
  /**
   * byte[] d null
   */
  public byte[] d = null;

  /**
   * test c bul de addRecord() close ...
   * in Class h
   * addRecord() ...
   * closeRecord() ...
   * @param Nothing
   */
  public void a()
  {
    try
    {
      if (this.c)
        this.a.addRecord(this.d, 0, this.d.length);
      this.a.closeRecordStore();
      this.a = null;
    }
    catch (RecordStoreException localRecordStoreException)
    {
    }
    this.d = null;
  }

  /**
   * Test javadoc n eclipse doc for a() method
   * ham nay chac dug de xu ly saved game, load temp file ...
   * in Class h
   * addRecord() ...
   * closeRecord() ...
   * boolean
   * @param String, boolean
   */
  public boolean a(String paramString, boolean paramBoolean)
  {
    try
    {
      if (paramBoolean)
        RecordStore.deleteRecordStore(paramString);
    }
    catch (Exception localException)
    {
    }
    this.c = paramBoolean;
    try
    {
      this.a = RecordStore.openRecordStore(paramString, paramBoolean);
      this.b = 0;
    }
    catch (RecordStoreException localRecordStoreException1)
    {
      System.out.println("RMS.open():" + localRecordStoreException1.toString());
      return false;
    }
    if (paramBoolean)
      this.d = new byte[100];
    else
      try
      {
        this.d = this.a.getRecord(1);
      }
      catch (RecordStoreException localRecordStoreException2)
      {
      }
    return true;
  }
/**
 * public int b
 * d la byte[]
 * 
 *   i = this.d[this.b] & 0xFF;
    i += ((this.d[(this.b + 1)] & 0xFF) << 8);
    i += ((this.d[(this.b + 2)] & 0xFF) << 16);
    i += ((this.d[(this.b + 3)] & 0xFF) << 24);
    this.b += 4;
    return i;
 * @return
 * int i
 */
  public int b()
  {
    int i = 0;
    // d la byte[] b la int & 0xFF la tinh and bit
    i = this.d[this.b] & 0xFF;
    i += ((this.d[(this.b + 1)] & 0xFF) << 8);
    i += ((this.d[(this.b + 2)] & 0xFF) << 16);
    i += ((this.d[(this.b + 3)] & 0xFF) << 24);
    this.b += 4;
    return i;
  }
/**
 * void a
 * this.d[this.b] = (byte)(paramInt & 0xFF);
    this.d[(this.b + 1)] = (byte)(paramInt >> 8 & 0xFF);
    this.d[(this.b + 2)] = (byte)(paramInt >> 16 & 0xFF);
    this.d[(this.b + 3)] = (byte)(paramInt >> 24 & 0xFF);
    this.b += 4;
 * @param paramInt
 * 
 */
  public void a(int paramInt)
  {
    this.d[this.b] = (byte)(paramInt & 0xFF);
    this.d[(this.b + 1)] = (byte)(paramInt >> 8 & 0xFF);
    this.d[(this.b + 2)] = (byte)(paramInt >> 16 & 0xFF);
    this.d[(this.b + 3)] = (byte)(paramInt >> 24 & 0xFF);
    this.b += 4;
  }
}