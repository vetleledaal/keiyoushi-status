# Extension Validation Report

- Extension: tachiyomi-en.heytoon-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 34
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5192468917881435636
- Source name: ToonHey
- Source language: en
- Selected manga input: popular offset 0: Osaka (`.../eXs49xSa.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 41 | Osaka (`.../eXs49xSa.html`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 54 | Don’t Call Me Stepmom (`.../LqjVn6Vw.html`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 54 | Aunt’s embrace (`.../mQdrMNcH.html`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 54 | Fast & Curious Uncensored (`.../ZVSfw4wY.html`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | Osaka (`.../eXs49xSa.html`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Osaka (`.../eXs49xSa.html`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 41 | Osaka - 1 (`.../episode-1-s6ggCZ3N.html`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 96 |  |  | 1-10s |

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
| popular listing | PASS | 41 entries |  |  |  |
| latest listing | PASS | 54 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Osaka, URL=`.../eXs49xSa.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Osaka, URL=`.../eXs49xSa.html` at page 1 offsets 0, 27 and page 2 offset 37, title=Let's Get Physical, URL=`.../ZyzEETtE.html` at page 1 offsets 1, 29 and page 2 offset 40, title=She's Driving Me Crazy, URL=`.../3MTtihkS.html` at page 1 offsets 2, 30 and page 2 offset 42, title=Like Fine Wine, URL=`.../nKylEEtd.html` at page 1 offsets 3, 24 and page 2 offset 18, title=Healing Hands, URL=`.../ZOwLm3w9.html` at page 1 offset 4 and page 2 offset 27, title=Honeymoon With My Mother-In-Law, URL=`.../76XcZUdu.html` at page 1 offset 6 and page 2 offset 8, title=Winter Games, URL=`.../ZahXxsfs.html` at page 1 offset 7 and page 2 offset 11, title=Stepmom Comes First, URL=`.../cWPfOT8f.html` at page 1 offset 8 and page 2 offset 14, title=Don’t Call Me Stepmom, URL=`.../LqjVn6Vw.html` at page 1 offset 9 and page 2 offset 0, title=Extra Credit, URL=`.../hYiHHoXE.html` at page 1 offset 10 and page 2 offset 26, title=The Assistant, URL=`.../tMDfqVCC.html` at page 1 offset 11 and page 2 offset 49, title=Love Factory, URL=`.../LhJcoVCg.html` at page 1 offset 13 and page 2 offset 35, title=Four's a Crowd, URL=`.../l5QOB8H9.html` at page 1 offset 17 and page 2 offset 30, title=The Unwanted Roommate, URL=`.../2zhPLIkY.html` at page 1 offset 18 and page 2 offset 20, title=Teach Me First! Uncensored, URL=`.../yLBtaUqe.html` at page 1 offset 21 and page 2 offset 6, title=Winter Games 2 "MILF Edition", URL=`.../PKQQk0iY.html` at page 1 offset 22 and page 2 offset 23, title=Close Family, URL=`.../cKrDi03e.html` at page 1 offset 23 and page 2 offset 24, title=Secret Siblings, URL=`.../wbnedA7n.html` at page 1 offset 25 and page 2 offset 38, title=Infidelity 101, URL=`.../grDSeWqd.html` at page 1 offset 26 and page 2 offset 41, title=My Lust Christmas, URL=`.../zcb1pi7W.html` at page 1 offset 28 and page 2 offset 43, title=Loving Aunt, URL=`.../SPXsDDH8.html` at page 1 offset 31 and page 2 offset 7, title=Redhead’s first ride, URL=`.../gcaxfsC2.html` at page 1 offset 33 and page 2 offset 19, title=Rowdy Reunion, URL=`.../WCMR8hiG.html` at page 1 offset 34 and page 2 offset 45 |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | FAIL | Popular page 1 repeats 5 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 205/205 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 205/205 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://hcgcontent.com/.../f64398df-fbce-47b8-83f3-4d558936338c-1766568893-22.webp <redacted query values: sda4>` -> 2 manga URLs (examples: `.../cKrDi03e.html`, `.../5Bqvx4x9.html`), `https://hcgcontent.com/.../1508aad5-6e07-4950-8706-1d558e6c03b7-1766997367-19.webp <redacted query values: sda4>` -> 2 manga URLs (examples: `.../wbnedA7n.html`, `.../x6qJ0gnT.html`), `https://hcgcontent.com/.../aaac5756-61ec-418a-891e-f23c6fec8809-1766467566-35.webp <redacted query values: sda4>` -> 2 manga URLs (examples: `.../grDSeWqd.html`, `.../qwQcp970.html`), `https://hcgcontent.com/.../f83de994-7e04-4559-9d22-c3d2437e1bba-1788415686-41.webp <redacted query values: sda4>` -> 2 manga URLs (examples: `.../PPOa2F0D.html`, `.../i9RQmpK8.html`), `https://hcgcontent.com/.../cac369a4-9c03-44fb-9ec3-eed217200679-1786629811-59.webp <redacted query values: sda4>` -> 2 manga URLs (examples: `.../qLm077IW.html`, `.../yGWDDOWa.html`), `https://hcgcontent.com/.../693fda30-b1da-4e5c-8d6f-d4378e2b7f55-1784127367-51.webp <redacted query values: sda4>` -> 2 manga URLs (examples: `.../bIX6VdGJ.html`, `.../Zv5kJzDO.html`), `https://hcgcontent.com/.../1aac0100-c2f6-433f-87d1-4636e83adf79-1781876462-90.webp <redacted query values: sda4>` -> 2 manga URLs (examples: `.../ykTxZ77Y.html`, `.../SK042O0Z.html`), `https://hcgcontent.com/.../b7b46774-5a6b-488c-947b-0007ab3ed6f0-1781790598-96.webp <redacted query values: sda4>` -> 2 manga URLs (examples: `.../BYeIKdOa.html`, `.../UQ4hUuF5.html`), `https://hcgcontent.com/.../6d891fa3-38dd-4a32-8ab9-302df8f79834-1778851767-52.webp <redacted query values: sda4>` -> 2 manga URLs (examples: `.../QCL1LjQw.html`, `.../6Y3SOZuY.html`), `https://hcgcontent.com/.../80ba8ae3-eda8-4447-8395-d0b106231d9c-1776065458-46.webp <redacted query values: sda4>` -> 2 manga URLs (examples: `.../Ac5yN0X4.html`, `.../v7E3BUdR.html`) |  |  |  |
| thumbnail | PASS | `https://hcgcontent.com/.../fdf91dd2-a0e5-4d47-b256-a2a3df0d6ece-1757937819-24.webp <redacted query values: sda4>` (image/webp (container: extended), 108638 bytes, 744x1104) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../eXs49xSa.html` |  |  |  |
| details thumbnail URL | PASS | `https://hcgcontent.com/.../fdf91dd2-a0e5-4d47-b256-a2a3df0d6ece-1757937819-24.webp <redacted query values: sda4>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | # Romance, # College, # Hentai |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | After breaking up with his high school sweetheart, Park Sejin takes a solo trip to Osaka, where he meets the lonely Nakashima Haru. They share a passionate night, but she disappears by morning. Sejin thinks it’s over—until Haru suddenly appears as an exchange student at his college. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 41 chapters |  |  |  |
| chapter dates | PASS | 41 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 96 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://hcgcontent.com/.../9c93503b-60fb-4a78-9039-4e60a03addb2-1757937850-84.webp <redacted query values: sda4>` (image/webp (container: extended), 67908 bytes, 1280x3720) |  |  |  |
