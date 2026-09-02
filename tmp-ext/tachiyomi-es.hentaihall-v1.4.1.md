# Extension Validation Report

- Extension: tachiyomi-es.hentaihall-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 31
- Lint: 3
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
- Selected manga input: latest offset 0: Arachne-san ni Dakarechaimashita (`.../arachne-san-ni-dakarechaimashita_1780270314417`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | [Nanao Yukiji] Soubo Koukan Nikki Sin Censura (`.../nanao-yukiji-soubo-koukan-nikki-sin-censura_1756095548905`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 30 | Las Enormes Tetas Copa "K" De La Madre De Mi Esposa Son Demasiadas Para Mi (`.../las-enormes-tetas-copa-k-de-la-madre-de-mi-esposa-son-demasiadas-para-mi_1758002900395`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 30 | Arachne-san ni Dakarechaimashita (`.../arachne-san-ni-dakarechaimashita_1780270314417`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | La Tutora Casada (`.../la-tutora-casada_1780270180360`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Arachne-san ni Dakarechaimashita (`.../arachne-san-ni-dakarechaimashita_1780270314417`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Arachne-san ni Dakarechaimashita (`.../arachne-san-ni-dakarechaimashita_1780270314417`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter (`.../arachne-san-ni-dakarechaimashita_1780270314417`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 25 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Arachne-san ni Dakarechaimashita, URL=`arachne-san-ni-dakarechaimashita_1780270314417` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | FAIL | Thumbnail URL `https://imagizer.imageshack.com/.../KRJA0o.jpg` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details identity | PASS | Details preserved selected URL `arachne-san-ni-dakarechaimashita_1780270314417` |  |  |  |
| details thumbnail URL | PASS | `https://imagizer.imageshack.com/.../KRJA0o.jpg` |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | Bestiality, Big Boobs, Blowjob, Monsters |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Tipo: Doujinshi<br>Lenguaje: Español<br>Grupo: HdidH<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 25 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | FAIL | First page URL `https://imagizer.imageshack.com/.../peXgvS.jpg` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
