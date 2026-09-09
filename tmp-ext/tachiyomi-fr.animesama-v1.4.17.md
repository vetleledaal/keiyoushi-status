# Extension Validation Report

- Extension: tachiyomi-fr.animesama-v1.4.17
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 28
- Lint: 3
- Warnings: 3
- Skipped: 2
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5104384223103778991
- Source name: AnimeSama
- Source language: fr
- Selected manga input: latest offset 0: The Ultimate Shut-In (`.../the-ultimate-shut-in`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 48 | 07 Ghost (`.../07-ghost`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 48 | Ao Ashi (`.../ao-ashi`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 85 | The Ultimate Shut-In (`.../the-ultimate-shut-in`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | The Ultimate Shut-In (`.../the-ultimate-shut-in`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | The Ultimate Shut-In (`.../the-ultimate-shut-in`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 91 | Chapitre 1 (`.../get_nb_chap_et_img.php <redacted query values: oeuvre, id, and title>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 17 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 48 entries |  |  |  |
| latest listing | PASS | 85 entries |  |  |  |
| search listing | LINT | Matched selected manga by title at result offset 0: title=The Ultimate Shut-In, URL=`.../the-ultimate-shut-in` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | FAIL | Latest page 1 repeats 7 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 182/182 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 182/182 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://cdn.jsdelivr.net/.../99-reinforced-wood-stick.webp` -> 2 manga URLs (examples: `.../99-reinforced-wood-stick`, `.../99-reinforced-wood-stick`), `https://cdn.jsdelivr.net/.../a-mercenarys-rebirth-among-nobles.webp` -> 2 manga URLs (examples: `.../a-mercenarys-rebirth-among-nobles`, `.../a-mercenarys-rebirth-among-nobles`), `https://cdn.jsdelivr.net/.../a-wimps-strategy-guide-to-conquer-the-tower.webp` -> 2 manga URLs (examples: `.../a-wimps-strategy-guide-to-conquer-the-tower`, `.../a-wimps-strategy-guide-to-conquer-the-tower`), `https://cdn.jsdelivr.net/.../the-ultimate-shut-in.webp` -> 2 manga URLs (examples: `.../the-ultimate-shut-in`, `.../the-ultimate-shut-in`) |  |  |  |
| thumbnail | PASS | `https://cdn.jsdelivr.net/.../the-ultimate-shut-in.webp` (image/webp (encoding: lossy), 12384 bytes, 440x248) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-ultimate-shut-in` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn.jsdelivr.net/.../the-ultimate-shut-in.jpg` (image/jpeg, 172380 bytes, 1600x900) |  |  |  |
| details author | PASS | Bihyen Araman |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Webcomic, Manhwa, Action, Aventure, Fantasy, Comédie |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Un hikikomori ultime se retrouve dote de pouvoirs extraordinaires dans un monde ou des evenements surnaturels se produisent. Malgre sa nature recluse, il est contraint de sortir de son isolement pour faire face a des menaces croissantes, utilisant ses capacites uniques de maniere inattendue. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 91 chapters |  |  |  |
| chapter dates | LINT | All 91 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=91 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://anime-sama.to/.../catalogue <redacted query values: type\[\] and page>` to `https://anime-sama.to/.../catalogue <redacted query values: type\[\] and page>` (1 redirects); popular_next: `https://anime-sama.to/.../catalogue <redacted query values: type\[\] and page>` to `https://anime-sama.to/.../catalogue <redacted query values: type\[\] and page>` (1 redirects); search: `https://anime-sama.to/.../catalogue <redacted query values: type\[\], search, and page>` to `https://anime-sama.to/.../catalogue <redacted query values: type\[\], search, and page>` (1 redirects) |  |  |  |
| page load | PASS | `https://anime-sama.to/.../1.jpg` (image/jpeg, 254542 bytes, 735x1219) |  |  |  |
