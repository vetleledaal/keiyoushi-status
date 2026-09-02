# Extension Validation Report

- Extension: tachiyomi-en.athreascans-v1.4.33
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 427734044452073936
- Source name: Athrea Scans
- Source language: en
- Selected manga input: popular offset 0: Stop Fighting, Go to Bed (`.../stop-fighting-go-to-bed`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 35 | Stop Fighting, Go to Bed (`.../stop-fighting-go-to-bed`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 35 | Male School (`.../male-school`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 35 | Dokkaebi (`.../dokkaebi`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 35 | The Hero Who Has Sex With a Demon (`.../the-hero-who-has-sex-with-a-demon`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Stop Fighting, Go to Bed (`.../stop-fighting-go-to-bed`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Stop Fighting, Go to Bed (`.../stop-fighting-go-to-bed`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 53 | Chapter 1 (`.../stop-fighting-go-to-bed-chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 16 |  |  | 1-10s |

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
| popular listing | PASS | 35 entries |  |  |  |
| latest listing | PASS | 35 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Stop Fighting, Go to Bed, URL=`.../stop-fighting-go-to-bed` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 141/141 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 141/141 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://athreascans.com/.../tall-24-225x300.jpg` (image/jpeg, 23594 bytes, 225x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../stop-fighting-go-to-bed` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://athreascans.com/.../tall-24.jpg` (image/jpeg, 282164 bytes, 840x1120) |  |  |  |
| details author | PASS | Kimguuk |  |  |  |
| details artist | PASS | Kimguuk |  |  |  |
| details genres | PASS | Adult, Drama, Romance, Smut, Yuri, Manhwa |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Heesoo, a 24-year-old who has never dated before, finally gets into the romantic relationship she had always dreamed of. However, during her first time with her boyfriend, her fantasies are shattered. One day, while drinking with her lesbian friend Jaeyeon, she ends up going to a lesbian bar, where she meets Joohee. The two are drawn to each other and share a kiss, leaving Heesoo feeling both confused about her sexual orientation and guilty toward her boyfriend. In her confusion, Heesoo visits the lesbian bar several more times in hopes of seeing Joohee again. Eventually, she meets her once more, and they head straight to a motel. But just before things progress, a KakaoTalk message from Heesoo’s boyfriend pops up on her phone. Joohee sees it, feels ridiculous about the situation, and leaves immediately. Heesoo mistakenly believes Joohee left because she couldn’t go through with it, and out of guilt toward her boyfriend, she decides to break up with him. However, Joohee misunderstands, thinking that Heesoo is still dating her boyfriend. Even while spending time with her FWB, Minyoung, Joohee can’t stop thinking about Heesoo. Will Heesoo and Joohee’s feelings ever be properly conveyed to each other?<br><br>Alternative Names: 그만 싸우고 자자 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 53 chapters |  |  |  |
| chapter dates | PASS | 53 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://athreascans.com/.../01.jpg` (image/jpeg, 1323120 bytes, 800x13830) |  |  |  |
