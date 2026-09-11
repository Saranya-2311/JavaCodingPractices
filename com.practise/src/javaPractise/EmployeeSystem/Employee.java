package javaPractise.EmployeeSystem;

import java.util.Objects;

public class Employee {
        private int id;
        private String name;

        public Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }
        @Override
        public boolean equals(Object obj){

            if (this == obj) return true;
            if (obj == null || this.getClass() != obj.getClass()) return false;
            Employee other = (Employee) obj;
            return id == other.id &&
                    Objects.equals(name, other.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);             // Generate combined hash
        }
}
