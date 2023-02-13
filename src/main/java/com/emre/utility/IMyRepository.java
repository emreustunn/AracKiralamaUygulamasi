package com.emre.utility;

/**
 * Iliskisel veya iliskisel olmayan tum DB yapilarında kullanılmak uzere genisletilebilir,
 * entegre edilebilir bir sistem kullanmak icin bu interface kullanılacaktır.
 * @param <T> Entity icin type belirtir.(Musteri,prdduct vs..)
 * @param <ID> Entity icindeki @Id ile belirlenims id yi temsil eder.
 *            bu id nin type'i girilmelidir.
 */
public interface IMyRepository<T,ID> {
}
