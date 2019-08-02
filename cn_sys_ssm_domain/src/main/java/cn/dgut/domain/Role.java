package cn.dgut.domain;

/**
 * 角色实体类
 */
public class Role {
    //主键
    private String id;
    //角色名称
    private String rolename;
    //角色描述
    private String roledesc;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getRoledesc() {
        return roledesc;
    }

    public void setRoledesc(String roledesc) {
        this.roledesc = roledesc;
    }
}
