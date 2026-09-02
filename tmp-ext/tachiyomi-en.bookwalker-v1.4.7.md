# Extension Validation Report

- Extension: tachiyomi-en.bookwalker-v1.4.7
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: 81336186c4ddb47e2a35eeb9ae58ceb10e8dc995
- Passed: 34
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2744810059574599668
- Source name: BookWalker
- Source language: en
- Selected manga input: popular offset 0: Ascendance of a Bookworm (`.../ascendance-of-a-bookworm`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 59 | Ascendance of a Bookworm (`.../ascendance-of-a-bookworm`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 60 | Chained Soldier (`.../chained-soldier`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 47 | Gou-dere Sora Nagihara (`.../gou-dere-sora-nagihara`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 59 | 404 Demons (`.../404-demons`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Ascendance of a Bookworm (`.../ascendance-of-a-bookworm`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Ascendance of a Bookworm (`.../ascendance-of-a-bookworm`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 31 | Volume 1 💵 (`.../ascendance-of-a-bookworm-volume-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 32 |  |  | 1-10s |

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
| popular listing | PASS | 59 entries |  |  |  |
| latest listing | PASS | 47 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Ascendance of a Bookworm, URL=`.../ascendance-of-a-bookworm` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 226/226 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 216/226 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.sos-dan.net/.../619MEAHAY9VDR3NV3CY1R.webp` (image/webp (container: extended), 82362 bytes, 513x720) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../ascendance-of-a-bookworm` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://img.sos-dan.net/.../619MEAHAY9VDR3NV3CY1R.webp` (image/webp (container: extended), 186454 bytes, 855x1200) |  |  |  |
| details author | PASS | Miya Kazuki |  |  |  |
| details artist | PASS | Suzuka, Ryo Namino, Hikaru Katsuki |  |  |  |
| details genres | PASS | Isekai, Drama, Comedy, Fantasy, Shoujo |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | A young woman who loves books dies and is reborn in another world as Myne, a sickly child from a poor family. Worst of all, there are almost no books in this world! So Myne decides that she'll just have to make her own and become a librarian.<br><br>A certain college girl who's loved books ever since she was a little girl dies in an accident and is reborn in another world she knows nothing about. She is now Myne, the sickly five-year-old daughter of a poor soldier. To make things worse, the world she's been reborn in has a very low literacy rate and books mostly don't exist. She'd have to pay an enormous amounts of money to buy one. Myne resolves herself: If there aren't any books, she'll just have to make them! Her goal is to become a librarian. This story begins with her quest to make books so she can live surrounded by them! Dive into this biblio-fantasy written for book lovers and bookworms! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 31 chapters |  |  |  |
| chapter dates | PASS | 31 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 32 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://flame.sos-dan.net/.../0.webp <redacted query values: clientid and token>` (image/webp (encoding: lossy), 486922 bytes, 1460x2048) |  |  |  |
