# Extension Validation Report

- Extension: tachiyomi-en.mangamo-v1.4.7
- Input artifact: JAR
- Generated at: 2026-09-02T14:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56+dirty
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6458420328066857684
- Source name: Mangamo
- Source language: en
- Selected manga input: latest offset 0: Your Highness, It’s Time to End Our Affair (`.../your-highness%2C-it%E2%80%99s-time-to-end-our-affair <redacted query values: series>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 50 | The Beginning of the End (`.../the-beginning-of-the-end <redacted query values: series>`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 50 | A.D.A (`.../a.d.a <redacted query values: series>`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 6 | Your Highness, It’s Time to End Our Affair (`.../your-highness%2C-it%E2%80%99s-time-to-end-our-affair <redacted query values: series>`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 33 | I'm That Monster Girl You Once Helped Out A Middle-Aged Teacher Finds Unexpected Popularity in Another World (`.../i%27m-that-monster-girl-you-once-helped-out-a-middle-aged-teacher-finds-unexpected-popularity-in-another-world <redacted query values: series>`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Your Highness, It’s Time to End Our Affair (`.../your-highness%2C-it%E2%80%99s-time-to-end-our-affair <redacted query values: series>`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Your Highness, It’s Time to End Our Affair (`.../your-highness%2C-it%E2%80%99s-time-to-end-our-affair <redacted query values: series>`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 28 | Chapter 1 🕒 (`<redacted URL #1: selected resource; relative; no scheme; query parameters: series and chapter>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 48 |  |  | <1s |

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
| latest listing | PASS | 6 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Your Highness, It’s Time to End Our Affair, URL=`.../your-highness%2C-it%E2%80%99s-time-to-end-our-affair <redacted query values: series>` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 140/140 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 140/140 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://firebasestorage.googleapis.com/.../series%2F1042%2F1772080729899_your_highness_title_art.jpg_your_highness_title_art.jpg <redacted query values: alt and token>` (image/jpeg, 158849 bytes, 285x450) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../your-highness%2C-it%E2%80%99s-time-to-end-our-affair <redacted query values: series>` |  |  |  |
| details thumbnail URL | PASS | `https://firebasestorage.googleapis.com/.../series%2F1042%2F1772080729899_your_highness_title_art.jpg_your_highness_title_art.jpg <redacted query values: alt and token>` |  |  |  |
| details author | PASS | Makano Oto |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Fantasy |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | "“I’m nothing more than your bedmate,” he said…<br>So why is he suddenly obsessed with me?!<br><br>When I open my eyes, I find myself reborn as a notorious villainess—<br>a disgraced noblewoman whose engagement was broken off after she was accused of plotting an assassination.<br><br>Just before my inevitable downfall, the one who always appears to save me is a dazzling, gentle prince…<br>or so I thought.<br><br>In reality, he’s a sharp-tongued, forceful man who refuses to let me go—<br>and apparently, we already have that kind of relationship.<br><br>Why was this villainess driven to attempted murder in the first place?<br>And why does this man, despite his harsh words, treat me with such unexpected tenderness?<br><br>A dangerous affair begins—where betrayal, devotion, and desire blur together…" |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 28 chapters |  |  |  |
| chapter dates | PASS | 28 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 48 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://d1yf5y28hthcut.cloudfront.net/.../01_Your%20Highness%2C%20It%E2%80%99s%20Time%20to%20End%20Our%20Affairp9%20(1).jpg <redacted query values: Expires, Key-Pair-Id, and Signature>` (image/jpeg, 1253841 bytes, 1242x1750) |  |  |  |
