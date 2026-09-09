# Extension Validation Report

- Extension: tachiyomi-es.hentaihall-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 34
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8488289812807090783
- Source name: HentaiHall
- Source language: es
- Selected manga input: popular offset 0: [Nanao Yukiji] Soubo Koukan Nikki Sin Censura (`.../nanao-yukiji-soubo-koukan-nikki-sin-censura_1756095548905`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | [Nanao Yukiji] Soubo Koukan Nikki Sin Censura (`.../nanao-yukiji-soubo-koukan-nikki-sin-censura_1756095548905`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 30 | Las Enormes Tetas Copa "K" De La Madre De Mi Esposa Son Demasiadas Para Mi (`.../las-enormes-tetas-copa-k-de-la-madre-de-mi-esposa-son-demasiadas-para-mi_1758002900395`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 30 | Arachne-san ni Dakarechaimashita (`.../arachne-san-ni-dakarechaimashita_1780270314417`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | La Tutora Casada (`.../la-tutora-casada_1780270180360`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | [Nanao Yukiji] Soubo Koukan Nikki Sin Censura (`.../nanao-yukiji-soubo-koukan-nikki-sin-censura_1756095548905`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | [Nanao Yukiji] Soubo Koukan Nikki Sin Censura (`.../nanao-yukiji-soubo-koukan-nikki-sin-censura_1756095548905`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter (`.../nanao-yukiji-soubo-koukan-nikki-sin-censura_1756095548905`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 96 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[Nanao Yukiji\] Soubo Koukan Nikki Sin Censura, URL=`nanao-yukiji-soubo-koukan-nikki-sin-censura_1756095548905` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | FAIL | Thumbnail URL `https://imagizer.imageshack.com/.../TZTrAa.jpg` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details identity | PASS | Details preserved selected URL `nanao-yukiji-soubo-koukan-nikki-sin-censura_1756095548905` |  |  |  |
| details thumbnail URL | PASS | `https://imagizer.imageshack.com/.../TZTrAa.jpg` |  |  |  |
| details author | PASS | Nanao Yukiji |  |  |  |
| details artist | PASS | Nanao Yukiji |  |  |  |
| details genres | PASS | Ahegao, Big Ass, Big Boobs, Group, Incest, Milf, Mother, Shota |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Tipo: Doujinshi<br>Lenguaje: Español<br>Grupo: Douma7<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 96 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | First page URL `https://imagizer.imageshack.com/.../5UrVUR.jpg` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
