# Extension Validation Report

- Extension: tachiyomi-all.misskon-v1.6.6
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 492049561920540214
- Source name: MissKon
- Source language: all
- Selected manga input: popular offset 0: [AI Enhanced] X-LEVEL JJUDY: Vol.98 Pussy CAT (100 photos) (`.../121774-ai-enhanced-x-level-jjudy-vol98-pussy-cat-100-photos`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 15 | [AI Enhanced] X-LEVEL JJUDY: Vol.98 Pussy CAT (100 photos) (`.../121774-ai-enhanced-x-level-jjudy-vol98-pussy-cat-100-photos`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Pure Media Vol.329: Yeha (예하) – Watch Football Eats Me (106 photos) (`.../121900-pure-media-vol329-yeha-watch-football-eats-me-106-photos`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Coser@Dreamtamu: Maid Ei (12 photos) (`.../121860-coser-dreamtamu-maid-ei-12-photos`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | [AI Enhanced] X–LEVEL JJUDY: Vol.98 Pussy CAT (100 photos) (`.../121774-ai-enhanced-x-level-jjudy-vol98-pussy-cat-100-photos`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | [AI Enhanced] X-LEVEL JJUDY: Vol.98 Pussy CAT (100 photos) (`.../121774-ai-enhanced-x-level-jjudy-vol98-pussy-cat-100-photos`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3 | Page 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 11 |  |  | 1-10s |

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
| popular listing | PASS | 15 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[AI Enhanced\] X–LEVEL JJUDY: Vol.98 Pussy CAT (100 photos), URL=`.../121774-ai-enhanced-x-level-jjudy-vol98-pussy-cat-100-photos` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 56/56 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 56/56 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://misskon.com/.../AI-Enhanced-X-LEVEL-JJUDY-Vol.98-Pussy-CAT-MissKON.com-000.webp` (image/webp (container: extended), 20808 bytes, 600x315) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../121774-ai-enhanced-x-level-jjudy-vol98-pussy-cat-100-photos` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | AI Enhanced, JJUDY, X-Level |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | PASS | 3 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 11 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://misskon.com/.../1` to `https://misskon.com` (1 redirects); popular: `https://misskon.com/.../1` to `https://misskon.com/.../121774-ai-enhanced-x-level-jjudy-vol98-pussy-cat-100-photos` (2 redirects); popular: `https://misskon.com/.../2` to `https://misskon.com/.../2` (1 redirects) |  |  |  |
| page load | PASS | `https://kul.misskon.com/.../AI-Enhanced-X-LEVEL-JJUDY-Vol-98-Pussy-CAT-MissKON-com-003.83pyhboC.webp` (image/webp (encoding: lossy), 81706 bytes, 1024x1793) |  |  |  |
