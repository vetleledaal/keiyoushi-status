# Extension Validation Report

- Extension: tachiyomi-pt.origamiorpheans-v1.4.43
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 32
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 4038055363600290082
- Source name: Origami Orpheans
- Source language: pt-BR
- Selected manga input: popular offset 0: Shuumatsu no Harem (`.../shuumatsu-no-harem`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 21 | Shuumatsu no Harem (`.../shuumatsu-no-harem`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 21 | Kono Healer Mendokusai (`.../kono-healer-mendokusai`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Shuumatsu no Harem (`.../shuumatsu-no-harem`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Shuumatsu no Harem (`.../shuumatsu-no-harem`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 101 | Capítulo 1 (`.../shuumatsu-no-harem-capitulo-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 48 |  |  | 1-10s |

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
| popular listing | PASS | 21 entries |  |  |  |
| latest listing | PASS | 21 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Shuumatsu no Harem, URL=`.../shuumatsu-no-harem` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 43/43 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 43/43 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://origami-orpheans.com/.../SHUUMATSU-1-211x300.jpg` (image/jpeg, 24404 bytes, 211x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../shuumatsu-no-harem` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://origami-orpheans.com/.../SHUUMATSU-1.jpg` (image/jpeg, 170336 bytes, 702x1000) |  |  |  |
| details author | PASS | LINK |  |  |  |
| details artist | PASS | Kotaro Shono |  |  |  |
| details genres | PASS | Adulto, Ecchi, Harém, Hentai, Sci-fi, Shounen |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Devido à uma doença fatal, um jovem garoto é posto para dormir por 5 anos pelo método da criogênesis, até que uma cura fosse encontrada. Quando acorda, ele tem uma grande surpresa.<br><br>Nomes alternativos: World's End Harem |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 101 chapters |  |  |  |
| chapter dates | PASS | 101 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 48 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://origami-orpheans.com/.../01_00.jpg` (image/jpeg, 227121 bytes, 980x980) |  |  |  |
