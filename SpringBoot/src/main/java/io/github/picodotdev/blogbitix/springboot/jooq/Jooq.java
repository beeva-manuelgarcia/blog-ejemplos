/**
 * This class is generated by jOOQ
 */
package io.github.picodotdev.blogbitix.springboot.jooq;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import io.github.picodotdev.blogbitix.springboot.jooq.tables.Department;
import io.github.picodotdev.blogbitix.springboot.jooq.tables.Employee;
import io.github.picodotdev.blogbitix.springboot.jooq.tables.EmployeeDepartment;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Jooq extends SchemaImpl {

	private static final long serialVersionUID = 1373329704;

	/**
	 * The reference instance of <code>JOOQ</code>
	 */
	public static final Jooq JOOQ = new Jooq();

	/**
	 * No further instances allowed
	 */
	private Jooq() {
		super("JOOQ");
	}

	@Override
	public final List<Sequence<?>> getSequences() {
		List result = new ArrayList();
		result.addAll(getSequences0());
		return result;
	}

	private final List<Sequence<?>> getSequences0() {
		return Arrays.<Sequence<?>>asList(
			Sequences.SYSTEM_SEQUENCE_50DF79A2_56EC_4A82_9556_8D4D02464C70,
			Sequences.SYSTEM_SEQUENCE_7E0B2DED_FDE0_4E46_83B6_4680A47BA415,
			Sequences.SYSTEM_SEQUENCE_D497824B_20C5_42FE_8B14_88BF32D119DF);
	}

	@Override
	public final List<Table<?>> getTables() {
		List result = new ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final List<Table<?>> getTables0() {
		return Arrays.<Table<?>>asList(
			Employee.EMPLOYEE,
			Department.DEPARTMENT,
			EmployeeDepartment.EMPLOYEE_DEPARTMENT);
	}
}