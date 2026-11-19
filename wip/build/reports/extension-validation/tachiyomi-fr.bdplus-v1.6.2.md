# Extension Validation Report

- Extension: tachiyomi-fr.bdplus-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 2
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 316968276877762203
- Source name: BDplus
- Source language: fr
- Selected manga input: popular offset 0: Astérix (`.../asterix`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Astérix (`.../asterix`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Valérian (`.../valerian`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Robilar ou le Maistre Chat (`.../robilar-ou-le-maistre-chat`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Vampirella (`.../vampirella`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Astérix (`.../asterix`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Astérix (`.../asterix`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 46 | Tome 01 : Astérix le Gaulois (`.../01-asterix-le-gaulois`) |  | <1s |
| pages | `getPageList(chapter)` | success | 48 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Astérix, URL=`asterix` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 98/98 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 98/98 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://bdplus.cc/.../cover.webp` (image/webp (encoding: lossy), 14744 bytes, 181x240) |  |  |  |
| details identity | PASS | Details preserved selected URL `asterix` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://bdplus.cc/.../cover_hi.webp` (image/webp (encoding: lossy), 66366 bytes, 400x533) |  |  |  |
| details author | PASS | René Goscinny, Albert Uderzo |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Humour |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Astérix est une bande dessinée culte qui raconte, avec humour et intelligence, les aventures d’un village gaulois qui résiste encore et toujours à l’envahisseur romain. Entre satire, amitié et bravoure, chaque album est un classique intemporel. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 46 chapters |  |  |  |
| chapter dates | LINT | All 46 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=46 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 48 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://bdplus.cc/.../001.webp` (image/webp (encoding: lossy), 472992 bytes, 1461x1920) |  |  |  |
