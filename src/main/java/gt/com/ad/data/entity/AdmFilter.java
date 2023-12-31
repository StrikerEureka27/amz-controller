package gt.com.ad.data.entity;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "adm_filter")
public class AdmFilter implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Column(name = "created_at", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime createdAt;
    private boolean active;
    private String header;
    private String reference;
    private int level;
    private int type;

    @ManyToOne
    @JoinColumn(name = "type", insertable = false, updatable = false)
    private AdmFilterType filterType;

    @ManyToMany
    @JoinTable(name = "adm_filter_parameter", joinColumns = @JoinColumn(name = "filter"), inverseJoinColumns = @JoinColumn(name = "parameter"))
    Set<AdmParameter> parameters = new HashSet<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public AdmFilterType getFilterType() {
        return filterType;
    }

    public void setFilterType(AdmFilterType filterType) {
        this.filterType = filterType;
    }

    public Set<AdmParameter> getParameters() {
        return parameters;
    }

    public void setParameters(Set<AdmParameter> parameters) {
        this.parameters = parameters;
    }

    
    
    

    

}
