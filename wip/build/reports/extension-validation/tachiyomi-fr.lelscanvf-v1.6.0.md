# Extension Validation Report

- Extension: tachiyomi-fr.lelscanvf-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Source theme: fuzzydoodle
- Source ID: 4874205281198767614
- Source name: Lelscan-VF
- Source language: fr
- Selected manga input: popular offset 0: Maria No Danzai (`.../maria-no-danzai`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Maria No Danzai (`.../maria-no-danzai`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | My Giant Nerd Boyfriend (`.../my-giant-nerd-boyfriend`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | One Piece (`.../one-piece`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Vinland Saga (`.../vinland-saga`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Maria No Danzai (`.../maria-no-danzai`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Maria No Danzai (`.../maria-no-danzai`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 32 | Chapitre 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 61 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Maria No Danzai, URL=`.../maria-no-danzai` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.lelscanfr.com/.../6886be30dad35.webp` (image/webp (encoding: lossy), 33436 bytes, 500x694) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../maria-no-danzai` |  |  |  |
| details thumbnail URL | PASS | `https://www.lelscanfr.com/.../6886be30dad35.webp` |  |  |  |
| details author | PASS | Kazuki |  |  |  |
| details artist | PASS | Kamejima Junto |  |  |  |
| details genres | PASS | Manga, Seinen, Drame, Mature, Vie Scolaire, Tragédie, Harcèlement, Psychologie, Crime, Vengeance, Thriller |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | La famille Nagare est une famille à trois d'apparence heureuse. Cependant, le fils Kiritaka cache à ses parents qu'il est cruellement harcelé à l'école. A la suite d'un tragique accident, l'amour bienveillant de sa mère, Mari, va se transformer en une force complétement incontrôlable.<br><br>Alternative Title: Seibo no Danzai |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 32 chapters |  |  |  |
| chapter dates | LINT | All 32 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=32 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 61 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://www.lelscanfr.com/.../68874d1a71416.webp` (image/webp (encoding: lossy), 165676 bytes, 981x1400) |  |  |  |
