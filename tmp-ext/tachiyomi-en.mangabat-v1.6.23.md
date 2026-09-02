# Extension Validation Report

- Extension: tachiyomi-en.mangabat-v1.6.23
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4215511432986138970
- Source name: Mangabat
- Source language: en
- Selected manga input: popular offset 0: Martial Peak (`.../martial-peak`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Martial Peak (`.../martial-peak`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Hajime No Ippo (`.../hajime-no-ippo`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | The Scum Noble Dominates by Humbly Grinding ~ Using Meta-Knowledge and the Unique Magic To Dodge the Bad End ~ (`.../the-scum-noble-dominates-by-humbly-grinding-using-meta-knowledge-and-the-unique-magic-to-dodge-the-bad-end`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | A Horde Of Zombies (`.../a-horde-of-zombies`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 20 | Martial Peak (`.../martial-peak`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Martial Peak (`.../martial-peak`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3877 | Chapter 1 (`https://www.mangabats.com/.../chapter-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 20 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Martial Peak, URL=`.../martial-peak` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 116/116 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 116/116 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img-r1.2xstorage.com/.../martial-peak.webp` (image/webp (encoding: lossy), 7910 bytes, 160x213) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../martial-peak` |  |  |  |
| details thumbnail URL | PASS | `https://img-r1.2xstorage.com/.../martial-peak.webp` |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Fantasy, Action, Adventure, Historical, Martial arts |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | You are reading Martial Peak manga, one of the most popular manga covering in Action, Adventure, Fantasy, Historical, Martial arts genres, written by Momo (Ii) at MangaBuddy, a top manga site to offering for free. Martial Peak has 3880 translated chapters and translations of other chapters are in progress. Lets enjoy. If you want to get the updates about latest chapters, lets create an account and add Martial Peak to your bookmark. The journey to the martial peak is a lonely, solitary and long one.In the face of adversity,you must survive and remain unyielding.Only then can you break through and and continue on your journey to become the strongest. Sky Tower tests its disciples in the harshest ways to prepare them for this journey.One day the lowly sweeper Yang Kai managed to obtain a black book, setting him on the road to the peak of the martials world. -MangaUpdates |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3877 chapters |  |  |  |
| chapter dates | PASS | 3877 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 3877 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img-r1.2xstorage.com/.../0.webp` (image/webp (encoding: lossy), 142546 bytes, 764x1200) |  |  |  |
