# Extension Validation Report

- Extension: tachiyomi-pt.instahentai-v1.6.0
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7005133773025256564
- Source name: Instahentai
- Source language: pt-BR
- Selected manga input: popular offset 0: Secret Class (`.../secret-class`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | Secret Class (`.../secret-class`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 18 | Sex Academy (`.../sex-academy`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 18 | Regressed Warrior’s Female Dominance Diary (`.../regressed-warriors-female-dominance-diary`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 18 | Wireless Onahole (`.../wireless-onahole`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 4 | Secret Class (`.../secret-class`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Secret Class (`.../secret-class`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 325 | Capitulo 1 (`.../ler-secret-class-capitulo-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 37 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Secret Class, URL=`secret-class` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 76/76 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 76/76 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://instahentai.com/.../secret-class-1-234x300.webp` (image/webp (encoding: lossy), 9050 bytes, 234x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `secret-class` |  |  |  |
| details thumbnail URL | PASS | `https://instahentai.com/.../secret-class-1-234x300.webp` |  |  |  |
| details author | PASS | Wang Kang Cheol |  |  |  |
| details artist | PASS | Minachan |  |  |  |
| details genres | PASS | Pornhwa, Comedia, Harem, Manhwa, Romance, Seinen, Slice of Life, Webtoon |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Daeho que ficou orfão aos 13 anos foi morar com sua nova família. Agora ele tem 20 anos mas muito inocente sobre sexo. As mulheres da casa de Daeho inventam uma aula secreta para torná-lo mais "esperto"... |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 325 chapters |  |  |  |
| chapter dates | LINT | 324 of 325 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=324 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 37 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.instahentai.com/.../01.jpg` (image/jpeg, 122288 bytes, 858x537) |  |  |  |
