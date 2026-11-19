# Extension Validation Report

- Extension: tachiyomi-tr.aftertoon-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 33
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4376691742390318529
- Source name: AfterToon
- Source language: tr
- Selected manga input: popular offset 0: Nişanlım Eski Bir Suikastçı (`.../nisanlim-eski-bir-suikastci`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 22 | Nişanlım Eski Bir Suikastçı (`.../nisanlim-eski-bir-suikastci`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 22 | Altın Elli Minik İş Başında! (`.../altin-elli-minik-is-basinda`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Nişanlım Eski Bir Suikastçı (`.../nisanlim-eski-bir-suikastci`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Nişanlım Eski Bir Suikastçı (`.../nisanlim-eski-bir-suikastci`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 43 | Bölüm 1 (`.../bolum-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 14 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 22 entries |  |  |  |
| latest listing | PASS | 22 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Nişanlım Eski Bir Suikastçı, URL=`.../nisanlim-eski-bir-suikastci` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 45/45 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 45/45 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.aftertoon.com/.../1785024640430-wumf5jr3rvs.jpg` (image/jpeg, 2553961 bytes, 4336x5804) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../nisanlim-eski-bir-suikastci` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.aftertoon.com/.../1785024640430-wumf5jr3rvs.jpg` |  |  |  |
| details author | PASS | SEIKI Fuyu |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Romantizm, Shoujo, Fantastik, Regression, Gizem |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ★★★★★ 9.6<br><br>Dükün kızı Ilya'nın evine ani bir haber ulaşır: Veliaht Prens Loren ile nişanlanacaktır. Loren sarayda karşısına çıktığında, yüzünde hiçbir duygu yoktur ve etrafa belli belirsiz tehlikeli bir hava yaymaktadır; en çok da o donuk, ışıksız gözleriyle dikkat çeker. "Ben bu gözleri biliyorum." Ilya'nın geçmiş hayatına dair hatıraları vardır: annesi tarafından istismara uğradığı ve sonunda karlı bir balkonda donarak öldüğü sert bir geçmiş. Öldüğü o son anda, camdaki yansımasında Loren'inkilerle tamamen aynı gözleri görmüştür. Kraldan Loren'in geçmişini öğrenir: On üç yıl önce komşu bir ülkede kaybolmuş, bir suikastçı olarak yetiştirilmiş ve sayısız tehlikeli görevi yerine getirmiştir. Bu ikinci hayatında kendisine sevgiyi öğreten ailesi uğruna, Ilya bu nişanı yürütmek zorundadır. Üstelik yaralı ruhlu Loren'i de öylece yüzüstü bırakamaz. Zamanla Ilya'nın içten gelen hisleri Loren'in kalbindeki boşlukları doldurmaya ve yavaş yavaş, farkında olmadan gerçek bir aşka dönüşmeye başlar...<br><br>**Alternative Names:**<br>- My Fiance Is a Former Assassin Prince, Konyaku Shita Ouji wa Moto Assassin de Shita RSS Feed |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 43 chapters |  |  |  |
| chapter dates | PASS | 43 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.aftertoon.com/.../page-0001.jpg` (image/jpeg, 3646061 bytes, 720x10000) |  |  |  |
