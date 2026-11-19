# Extension Validation Report

- Extension: tachiyomi-es.manhwashot-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6396464356141656797
- Source name: ManhwaShot
- Source language: es
- Selected manga input: popular offset 0: Emperador mágico (`.../emperador-magico-magic-emperor`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | Emperador mágico (`.../emperador-magico-magic-emperor`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 48 | An Innocent Sin (`.../an-innocent-sin`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 48 | Idol Una Vez Más (`.../idol-una-vez-mas`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Emperador mágico (`.../emperador-magico-magic-emperor`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Emperador mágico (`.../emperador-magico-magic-emperor`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 951 | Capítulo 1 (`.../capitulo-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 126 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 48 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Emperador mágico, URL=`.../emperador-magico-magic-emperor` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 147/147 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 147/147 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | FAIL | Thumbnail URL `https://img.manhwashot.lat/.../0ec9474b8600ff529a7629d2a1fa6ee51db6bb4f01820ed04156499ac5686680-3.gif <redacted query values: v and f>` did not contain a decodable image (950390 bytes) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details identity | PASS | Details preserved selected URL `.../emperador-magico-magic-emperor` |  |  |  |
| details thumbnail URL | PASS | `https://img.manhwashot.lat/.../0ec9474b8600ff529a7629d2a1fa6ee51db6bb4f01820ed04156499ac5686680-3.gif <redacted query values: v and f>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Acción, Artes Marciales, Aventura, Fantasía, Magia, ManhwaShot-Scan |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ★★★★★ 4.8 (37)<br><br>Zhuo Yifan es un emperador mágico o puede llamarse un emperador demonio, porque tiene un antiguo libro del emperador que se llama el "Libro de los Nueve Secretos", fue atacado por los siete emperadores e incluso su discípulo lo traicionó. Y para no dejar que obtengan el libro Zhuo Yifan condujo el asesinato de su cuerpo así mismo del libro. Luego, su alma entra y vuelve a la vida en un criadofamiliar llamado Zhuo Fan. Debido a que una magia demoníaca lo está frenando, debe unir los recuerdos del niño y no puede ignorar a la familia y la amante a la que sirve. ¿Cómo es su vida reconstruyendo a su familia y volviendo a ser el más fuerte del continente...?<br><br>**Títulos alternativos:**<br>- magic emperor<br>- Demonic Emperor<br>- Emperador Demoníaco<br>- 魔皇大管家<br>- The Steward Demonic Emperor<br>- Magic Emperor<br>- Emperador Magico<br>- The Devil Butler<br>- Demon Magic Emperor<br>- Der Diener des Dämonenkönigs<br>- Emperador Demoniaco<br>- Housekeeper Is the Magic Emperor<br>- How the Demon Emperor became a Butler<br>- Imperador Demoníaco<br>- Imperador Mágico<br>- Mo Huang Da Guan Jia Mo<br>- Huang Da Guanjia<br>- The Servant Is the Demon King?!<br>- The Steward Demon<br>- Đại Quản Gia Là Ma Hoàng<br>- Как демон-император стал дворецким<br>- امپراطور جادو<br>- พ่อบ้านราชาปีศาจ<br>- 従者は大魔皇 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 951 chapters |  |  |  |
| chapter dates | PASS | 951 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 126 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.manhwashot.lat/.../1.png <redacted query values: v>` (image/png, 1164252 bytes, 1343x1076) |  |  |  |
