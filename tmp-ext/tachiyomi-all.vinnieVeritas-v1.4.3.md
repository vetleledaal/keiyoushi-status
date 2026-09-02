# Extension Validation Report

- Extension: tachiyomi-all.vinnieVeritas-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 24
- Lint: 2
- Warnings: 0
- Skipped: 10
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 9005452006043030878
- Source name: Vinnie Veritas - CCC
- Source language: en
- Selected manga input: popular offset 0: CCC: The city of opportunities (`.../archiveIndex.php`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 1 | CCC: The city of opportunities (`.../archiveIndex.php`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | error | 0 |  | java.lang.UnsupportedOperationException | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | CCC: The city of opportunities (`.../archiveIndex.php`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 21 | #CCC CCC000 (`.../CCC000.php`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 1 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | SKIP | java.lang.UnsupportedOperationException |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 1 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | SKIP | search operation did not complete successfully |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | SKIP | Fewer than 2 manga to check |  |  |  |
| manga title and URL | PASS | 1/1 popular manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 1/1 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://ccc.vinnieveritas.com/.../CCCr000E.jpg` (image/jpeg, 557253 bytes, 1000x1250) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../archiveIndex.php` |  |  |  |
| details thumbnail URL | PASS | `https://ccc.vinnieveritas.com/.../CCCr000E.jpg` |  |  |  |
| details author | PASS | Vinnie Veritas |  |  |  |
| details artist | PASS | Vinnie Veritas |  |  |  |
| details genres | PASS | webcomic |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Almost 7 years ago I started working on a project where I would put everything I had drawn, characters, concepts and nonsense that came up while I was growing up .. it was so much I chose a city to put it all in. Like all people who draw, I abandoned many comics and concepts that I thought, sucked.. but I promised myself when I was around 19 years old that I would not abandon this one; because my ability to draw was less than today's, the first two volumes of CCC: The city of the opportunities are… umm, ugly. When I was around 21-22 years old I began to animate in flash, so I decided to animate the world embodied in the comic and continue with the comic this time drawn in flash, therefore Volume 3 has color.<br><br>In this period I had a lot of animation and illustration work would not let me continue the story of CCC: The city of opportunities, the hiatus lasted about 5 years, while I still did animations I did not carried on with the story in the comic .. Now new comics every Thursday.<br><br>CCC is the name of the second largest city there is, is not an acronym or an abbreviation for something, CCC: The city of opportunies tells the story of Lucio Vasalle and his misadventures as a newcomer to CCC, comics, drawings and animations are related, they all have bits of story about the characters and their past, you are welcome to explore all this and draw your own conclusions, if you look closely you may find something that someone hasn't noticed yet (:			 |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 21 chapters |  |  |  |
| chapter dates | LINT | All 21 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=21 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://ccc.vinnieveritas.com/.../CCCr000E.jpg` (image/jpeg, 557253 bytes, 1000x1250) |  |  |  |
