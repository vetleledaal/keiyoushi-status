# Extension Validation Report

- Extension: tachiyomi-pt.exhentainetbr-v1.4.4
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 31
- Lint: 1
- Warnings: 0
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1408140394859123923
- Source name: ExHentai.net.br
- Source language: pt-BR
- Selected manga input: popular offset 0: Eu não consigo ficar duro sem dois pares de seios, então minha esposa chamou uma amiga! (`.../eu-nao-consigo-ficar-duro-sem-dois-pares-de-seios-entao-minha-esposa-chamou-uma-amiga`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | Eu não consigo ficar duro sem dois pares de seios, então minha esposa chamou uma amiga! (`.../eu-nao-consigo-ficar-duro-sem-dois-pares-de-seios-entao-minha-esposa-chamou-uma-amiga`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 30 | Kaga-san no Tokubetsu Kunren (`.../kaga-san-no-tokubetsu-kunren`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Eu não consigo ficar duro sem dois pares de seios, então minha esposa chamou uma amiga! (`.../eu-nao-consigo-ficar-duro-sem-dois-pares-de-seios-entao-minha-esposa-chamou-uma-amiga`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Eu não consigo ficar duro sem dois pares de seios, então minha esposa chamou uma amiga! (`.../eu-nao-consigo-ficar-duro-sem-dois-pares-de-seios-entao-minha-esposa-chamou-uma-amiga`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 2 | Capítulo 1 (`.../chapter <redacted query values: id, ch, img, and paged>`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 57 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Eu não consigo ficar duro sem dois pares de seios, então minha esposa chamou uma amiga!, URL=`.../eu-nao-consigo-ficar-duro-sem-dois-pares-de-seios-entao-minha-esposa-chamou-uma-amiga` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 61/61 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 61/61 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://exhentai.net.br/.../01-1.jpg` (image/jpeg, 266170 bytes, 1280x1808) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../eu-nao-consigo-ficar-duro-sem-dois-pares-de-seios-entao-minha-esposa-chamou-uma-amiga` |  |  |  |
| details thumbnail URL | PASS | `https://exhentai.net.br/.../01-1.jpg` |  |  |  |
| details author | PASS | Tachibana Omina |  |  |  |
| details artist | PASS | Tachibana Omina |  |  |  |
| details genres | PASS | Ahegao, Anal, Boquete, Grupal, Masturbação, Paizuri, Peitões, Raio-X |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | LINT | Description is empty; use null when unknown |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | PASS | 2 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 57 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://exhentai.net.br/.../01-1.jpg` (image/jpeg, 266170 bytes, 1280x1808) |  |  |  |
