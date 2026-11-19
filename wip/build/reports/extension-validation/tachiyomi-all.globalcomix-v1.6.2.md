# Extension Validation Report

- Extension: tachiyomi-all.globalcomix-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.c
- Source ID: 1702911211040495914
- Source name: GlobalComix
- Source language: en
- Selected manga input: popular offset 0: Absolute Batman (2024-) (`.../26982`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Absolute Batman (2024-) (`.../26982`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Cyberpunk 2077 (`.../17309`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Rainbow of Crazy Comics (`.../44647`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | The Haha Crew (`.../23700`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 24 | Absolute Batman (2024-) (`.../26982`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Absolute Batman (2024-) (`.../26982`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 30 | 🔒 Ch.25 - Absolute Batman (2024-) #25 (`.../e51faf63-375f-4301-adea-2a531190ab34`) |  | <1s |
| pages | `getPageList(chapter)` | success | 35 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Absolute Batman (2024-), URL=`26982` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 120/120 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 120/120 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://globalcomix.com/.../112800_df038b3f29e399bfd928c581fb27563d_large.webp` (image/webp (container: extended), 60682 bytes, 540x834) |  |  |  |
| details identity | PASS | Details preserved selected URL `26982` |  |  |  |
| details thumbnail URL | PASS | `https://globalcomix.com/.../112800_df038b3f29e399bfd928c581fb27563d_large.webp` |  |  |  |
| details author | PASS | DC |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Without the mansion…without the money…without the butler…what's left is the Absolute Dark Knight! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 30 chapters |  |  |  |
| chapter dates | PASS | 30 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 35 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://globalcomix-comics-assets-files-desktop.nyc3.cdn.digitaloceanspaces.com/.../13119088_ce51e44f19e4dea39357d5135ae95f15.jpg <redacted query values: X-Amz-Algorithm, X-Amz-Credential, X-Amz-Date, X-Amz-Expires, X-Amz-SignedHeaders, and X-Amz-Signature>` (image/jpeg, 1381232 bytes, 1950x3057) |  |  |  |
