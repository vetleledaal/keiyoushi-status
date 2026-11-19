# Extension Validation Report

- Extension: tachiyomi-ru.desu-v1.6.36
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6684416167758830305
- Source name: Desu
- Source language: ru
- Selected manga input: popular offset 0: The Snow Leopard Baby of the Black Leopard Family (`.../6836`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | The Snow Leopard Baby of the Black Leopard Family (`.../6836`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Mairimashita! Iruma-kun (`.../1381`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | The Snow Leopard Baby of the Black Leopard Family (`.../6836`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Mairimashita! Iruma-kun (`.../1381`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 20 | The Snow Leopard Baby of the Black Leopard Family (`.../6836`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Snow Leopard Baby of the Black Leopard Family (`.../6836`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 70 | 1. Глава 1 (`.../612547`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 9 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Snow Leopard Baby of the Black Leopard Family, URL=`.../6836` |  |  |  |
| latest differs from popular | LINT | Latest page 1 exactly matches popular page 1; verify supportsLatest |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 100/100 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 100/100 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static.desu.uno/.../6836.jpg <redacted query values: 1748033731>` (image/jpeg, 121773 bytes, 375x525) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../6836` |  |  |  |
| details thumbnail URL | PASS | `https://static.desu.uno/.../6836.jpg <redacted query values: 1748033731>` |  |  |  |
| details author | PASS | Kim Norang |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Манхва, 16+, Романтика, Сёдзе, Фэнтези, Веб, Путешествие во времени, ГГ женщина |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Детёныш снежного барса из семейства чёрных леопардов<br>★★★★★ 9.63 (голосов: 8)<br>Альтернативные названия:<br>Снежный детеныш леопарда семейства Черных леопардов / 흑표 가문의 설표 아기님 / heugpyo gamun-ui seolpyo aginim<br><br>Родившись гибридом, я подвергалась насилию со стороны деда по материнской линии, потому что была бесполезным ребенком, не унаследовавшим никаких способностей от семьи отца, и в итоге умерла.<br>Я вернулась в прошлое со своими воспоминаниями, но мои возможности не сильно отличались от прошлых.<br>Либо я буду жить так же и подвергаться насилию, как и в прошлой жизни, либо отправлюсь к отцу, который меня ненавидит. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 70 chapters |  |  |  |
| chapter dates | PASS | 70 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 9 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img3.desu.uno/.../the_snow_leopard_baby_of_the_black_leopard_family_vol01_ch001_p001.jpg <redacted query values: 1748033749>` (image/jpeg, 111067 bytes, 847x610) |  |  |  |
