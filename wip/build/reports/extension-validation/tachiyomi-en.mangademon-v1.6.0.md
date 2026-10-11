# Extension Validation Report

- Extension: tachiyomi-en.mangademon-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2900023289777642714
- Source name: Manga Demon
- Source language: en
- Selected manga input: popular offset 0: Martial Peak (`.../Martial-Peak`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 56 | Martial Peak (`.../Martial-Peak`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 56 | Barbarian's Adven... (`.../Barbarian%2527s-Adventure-in-a-Fantasy-World`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 40 | Chronicles of the Lazy Sovereign (`.../Chronicles-of-the-Lazy-Sovereign`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 40 | High Martial Arts: My Cells Can Evolv... (`.../High-Martial-Arts%253A-My-Cells-Can-Evolve-Infinitely`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Martial Peak (`.../Martial-Peak`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Martial Peak (`.../Martial-Peak`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3869 | Chapter 1 (`.../chaptered.php <redacted query values: manga and chapter>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 20 |  |  | 1-10s |

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
| popular listing | PASS | 56 entries |  |  |  |
| latest listing | PASS | 40 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Martial Peak, URL=`.../Martial-Peak` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 193/193 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 193/193 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://readermc.org/.../Martial Peak.webp` (image/webp (encoding: lossy), 53302 bytes, 420x560) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../Martial-Peak` |  |  |  |
| details thumbnail URL | PASS | `https://readermc.org/.../Martial Peak.webp` |  |  |  |
| details author | PASS | Momo (II),Pikapi |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Historical, Martial Arts, Fantasy, Adventure, Action |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | The journey to the martial peak is a lonely, solitary and long one. In the face of adversity, you must survive and remain unyielding. Only then you can breakthrough and continue on your journey to becoming the strongest. High Heaven Pavilion tests its disciples in the harshest ways possible to prepare them for such a journey. One day the lowly sweeper Yang Kai managed to obtain a mysterious black book, setting him on the road to the peak of the martial world. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3869 chapters |  |  |  |
| chapter dates | PASS | 3869 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | FAIL | Duplicate chapter URLs: `.../chaptered.php <redacted query values: manga and chapter>` at offsets 157, 158 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://demonicscans.org/.../chaptered.php <redacted query values: manga and chapter>` to `https://demonicscans.org/.../1` (1 redirects) |  |  |  |
| page load | PASS | `https://mangareadon.org/.../1.jpg` (image/jpeg, 940490 bytes, 764x1200) |  |  |  |
