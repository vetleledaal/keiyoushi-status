# Extension Validation Report

- Extension: tachiyomi-es.doujinhentai-v1.6.1
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3895171315878328595
- Source name: DoujinHentai
- Source language: es
- Selected manga input: popular offset 0: Big Ass - Milftoon (`.../big-ass-milftoon-`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | Big Ass - Milftoon (`.../big-ass-milftoon-`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 18 | mother (`.../mother`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 18 | Otaku Tomodachi to no Sex wa Saikou ni Kimochi Ii Soushuuhen I (`.../otaku-tomodachi-to-no-sex-wa-saikou-ni-kimochi-ii-soushuuhen-i`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 18 | Garden I (`.../garden-i`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Big Ass - Milftoon (`.../big-ass-milftoon-`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Big Ass - Milftoon (`.../big-ass-milftoon-`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 2 | Capítulo 1: Cap 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 14 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Big Ass - Milftoon, URL=`.../big-ass-milftoon-` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 73/73 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 73/73 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://s4.zx89.site/.../cover_250x350.jpg` (image/jpeg, 14286 bytes, 250x350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../big-ass-milftoon-` |  |  |  |
| details thumbnail URL | PASS | `https://s4.zx89.site/.../cover_250x350.jpg` |  |  |  |
| details author | PASS | milftoon |  |  |  |
| details artist | PASS | milftoon |  |  |  |
| details genres | PASS | ecchi, Yaoi, Yuri, Anal, Tetonas, Incesto, Virgenes, Masturbacion, Maduras, Bikini, Sirvientas, Ahegao, Casadas, Harem, Romance, Mamadas, Shota, Full Color, Sin Censura, Acabadas, madre e hijo, Madre puta, madre sexy, Masturbación, Milf, Milftoon |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Aquí una colección de los primeras creaciones de Milftoon, espero les guste, comenten y subo mi repertorio de Milftoon, 100 por ciento recomendados. La historia es de un chico adolescente que va con su madre en el auto y discuten por tonterías, llegando a casa el chico se enoja y se va a su cuarto, la madre ingenia pensado hablar con el, cuando llega a la habitación de su hijo lo encuentra masturbandose con una foto de ella... |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | PASS | 2 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://s4.zx89.site/.../01.jpg` (image/jpeg, 128711 bytes, 726x1027) |  |  |  |
