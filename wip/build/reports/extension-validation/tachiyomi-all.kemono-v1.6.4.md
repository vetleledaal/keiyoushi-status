# Extension Validation Report

- Extension: tachiyomi-all.kemono-v1.6.4
- Input artifact: JAR
- Generated at: 2026-11-19T22:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: RETRY_NOW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: kemono
- Source ID: 2011050813940802605
- Source name: Kemono
- Source language: all
- Selected manga input: latest offset 0: ObscuraX Studio (`.../174107539`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | theobrobine (`.../5564244`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 50 | Belko (`.../39123643`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 50 | ObscuraX Studio (`.../174107539`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 50 | Hik (`.../148651837`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | ObscuraX Studio (`.../174107539`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | ObscuraX Studio (`.../174107539`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 23 | [Zip Download] (40+) Yunoelle (`.../130658989`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 1 |  |  | 10s+ |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=ObscuraX Studio, URL=`.../174107539` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 201/201 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 201/201 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.kemono.cr/.../174107539` (image/webp (container: extended), 4594 bytes, 160x160) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../174107539` |  |  |  |
| details thumbnail URL | PASS | `https://img.kemono.cr/.../174107539` |  |  |  |
| details author | PASS | Patreon |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | You can change how many posts to load in the extension preferences. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 23 chapters |  |  |  |
| chapter dates | PASS | 23 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | First page URL `https://kemono.cr/.../f025445d724cb4d057ebd7784e688635d298ad5c622c0ffc736b48647dc32858.png <redacted query values: f>` could not be downloaded: kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | RETRY_NOW | TIMEOUT |  |
