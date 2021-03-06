package me.xiezefan.easyim.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import me.xiezefan.easyim.dao.ChatItem;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table CHAT_ITEM.
*/
public class ChatItemDao extends AbstractDao<ChatItem, Long> {

    public static final String TABLENAME = "CHAT_ITEM";

    /**
     * Properties of entity ChatItem.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property MsgId = new Property(1, String.class, "msgId", false, "MSG_ID");
        public final static Property ChatSessionId = new Property(2, Long.class, "chatSessionId", false, "CHAT_SESSION_ID");
        public final static Property TargetId = new Property(3, String.class, "targetId", false, "TARGET_ID");
        public final static Property Type = new Property(4, String.class, "type", false, "TYPE");
        public final static Property FromId = new Property(5, String.class, "fromId", false, "FROM_ID");
        public final static Property Content = new Property(6, String.class, "content", false, "CONTENT");
        public final static Property Extras = new Property(7, String.class, "extras", false, "EXTRAS");
        public final static Property Status = new Property(8, String.class, "status", false, "STATUS");
        public final static Property IsSelf = new Property(9, Boolean.class, "isSelf", false, "IS_SELF");
        public final static Property CreateTime = new Property(10, Long.class, "createTime", false, "CREATE_TIME");
    };


    public ChatItemDao(DaoConfig config) {
        super(config);
    }
    
    public ChatItemDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'CHAT_ITEM' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'MSG_ID' TEXT," + // 1: msgId
                "'CHAT_SESSION_ID' INTEGER," + // 2: chatSessionId
                "'TARGET_ID' TEXT," + // 3: targetId
                "'TYPE' TEXT," + // 4: type
                "'FROM_ID' TEXT," + // 5: fromId
                "'CONTENT' TEXT," + // 6: content
                "'EXTRAS' TEXT," + // 7: extras
                "'STATUS' TEXT," + // 8: status
                "'IS_SELF' INTEGER," + // 9: isSelf
                "'CREATE_TIME' INTEGER);"); // 10: createTime
        // Add Indexes
        db.execSQL("CREATE INDEX " + constraint + "IDX_CHAT_ITEM_MSG_ID ON CHAT_ITEM" +
                " (MSG_ID);");
        db.execSQL("CREATE INDEX " + constraint + "IDX_CHAT_ITEM_TARGET_ID ON CHAT_ITEM" +
                " (TARGET_ID);");
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'CHAT_ITEM'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, ChatItem entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String msgId = entity.getMsgId();
        if (msgId != null) {
            stmt.bindString(2, msgId);
        }
 
        Long chatSessionId = entity.getChatSessionId();
        if (chatSessionId != null) {
            stmt.bindLong(3, chatSessionId);
        }
 
        String targetId = entity.getTargetId();
        if (targetId != null) {
            stmt.bindString(4, targetId);
        }
 
        String type = entity.getType();
        if (type != null) {
            stmt.bindString(5, type);
        }
 
        String fromId = entity.getFromId();
        if (fromId != null) {
            stmt.bindString(6, fromId);
        }
 
        String content = entity.getContent();
        if (content != null) {
            stmt.bindString(7, content);
        }
 
        String extras = entity.getExtras();
        if (extras != null) {
            stmt.bindString(8, extras);
        }
 
        String status = entity.getStatus();
        if (status != null) {
            stmt.bindString(9, status);
        }
 
        Boolean isSelf = entity.getIsSelf();
        if (isSelf != null) {
            stmt.bindLong(10, isSelf ? 1l: 0l);
        }
 
        Long createTime = entity.getCreateTime();
        if (createTime != null) {
            stmt.bindLong(11, createTime);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public ChatItem readEntity(Cursor cursor, int offset) {
        ChatItem entity = new ChatItem( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // msgId
            cursor.isNull(offset + 2) ? null : cursor.getLong(offset + 2), // chatSessionId
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // targetId
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // type
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // fromId
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // content
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // extras
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // status
            cursor.isNull(offset + 9) ? null : cursor.getShort(offset + 9) != 0, // isSelf
            cursor.isNull(offset + 10) ? null : cursor.getLong(offset + 10) // createTime
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, ChatItem entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setMsgId(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setChatSessionId(cursor.isNull(offset + 2) ? null : cursor.getLong(offset + 2));
        entity.setTargetId(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setType(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setFromId(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setContent(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setExtras(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setStatus(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setIsSelf(cursor.isNull(offset + 9) ? null : cursor.getShort(offset + 9) != 0);
        entity.setCreateTime(cursor.isNull(offset + 10) ? null : cursor.getLong(offset + 10));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(ChatItem entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(ChatItem entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
