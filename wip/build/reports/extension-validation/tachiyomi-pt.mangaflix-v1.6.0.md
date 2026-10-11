# Extension Validation Report

- Extension: tachiyomi-pt.mangaflix-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 31
- Lint: 2
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6813136769153267900
- Source name: MangaFlix
- Source language: pt-BR
- Selected manga input: popular offset 0: Martial Peak (`.../6513a5c4d0e2acdd1e1ab741`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Martial Peak (`.../6513a5c4d0e2acdd1e1ab741`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 100 | The Rankers Guide to Live an Ordinary Life (`.../67e61ee4baa0b6a1f6e69cf5`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 30 | Martial Peak (`.../6513a5c4d0e2acdd1e1ab741`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Martial Peak (`.../6513a5c4d0e2acdd1e1ab741`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3863 | Capítulo 1 (`.../655001ceafaaa71a7bb79b1d`) |  | <1s |
| pages | `getPageList(chapter)` | success | 18 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 100 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Martial Peak, URL=`.../6513a5c4d0e2acdd1e1ab741` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 160/160 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 160/160 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static.mangaflix.net/.../30c946e2-ab3e-4ca7-84b8-968c834311c4.jpg` (image/jpeg, 87670 bytes, 600x766) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../6513a5c4d0e2acdd1e1ab741` |  |  |  |
| details thumbnail URL | PASS | `https://static.mangaflix.net/.../30c946e2-ab3e-4ca7-84b8-968c834311c4.jpg` |  |  |  |
| details author | PASS | ArinVale |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ação, Aventura, Artes Marciais, Sobrenatural, Comédia, Fantasia, Romance, Histórico, Webtoon, Harém, Adaptação, Harem |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | A jornada para o pico marcial é solitária, solitária e longa. Diante da adversidade, você deve sobreviver e permanecer inflexível. Só então você pode romper e continuar em sua jornada para se tornar o mais forte. O High Heaven Pavilion testa seus discípulos da maneira mais dura possível para prepará-los para tal jornada. Um dia, o humilde varredor Yang Kai conseguiu obter um misterioso livro negro, colocando-o no caminho para o auge do mundo marcial. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3863 chapters |  |  |  |
| chapter dates | LINT | 2 of 3863 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=2 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 18 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://static.mangaflix.net/.../1.png` (image/png, 1030712 bytes, 979x1400) |  |  |  |
