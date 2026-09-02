# Extension Validation Report

- Extension: tachiyomi-all.kemono-v1.4.25
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 33
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2011050813940802605
- Source name: Kemono
- Source language: all
- Selected manga input: popular offset 0: theobrobine (`.../5564244`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 50 | theobrobine (`.../5564244`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 50 | Belko (`.../39123643`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 50 | ObscuraX Studio (`.../174107539`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 50 | Hik (`.../148651837`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | theobrobine (`.../5564244`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | theobrobine (`.../5564244`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 47 | [mp4,gif] Cow Ganyu cowgirl position +pregnant ver. 1080p,1440p (`.../96659449`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 10 |  |  | 1-10s |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=theobrobine, URL=`.../5564244` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 202/202 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 202/202 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.kemono.cr/.../5564244` (image/jpeg, 4589 bytes, 160x160) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../5564244` |  |  |  |
| details thumbnail URL | PASS | `https://img.kemono.cr/.../5564244` |  |  |  |
| details author | PASS | Patreon |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | You can change how many posts to load in the extension preferences. |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 4 name, chapter 29 name, chapter 38 name |  |  |  |
| chapters | PASS | 47 chapters |  |  |  |
| chapter dates | PASS | 47 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | FAIL | First page URL `https://kemono.cr/.../dff2f4f2f5704d3d9f39965722794a1e29afdb71cc9246f1bf10c65ce2d9802e.gif <redacted query values: f>` could not be downloaded: java.io.EOFException: SSL peer shut down incorrectly | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
