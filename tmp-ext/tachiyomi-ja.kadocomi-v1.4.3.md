# Extension Validation Report

- Extension: tachiyomi-ja.kadocomi-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 31
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8396089563187142394
- Source name: カドコミ
- Source language: ja
- Selected manga input: popular offset 0: 光が死んだ夏 (`.../KC_001571_S`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 50 | 光が死んだ夏 (`.../KC_001571_S`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 100 | アオハルリストは鳴り響く (`.../KC_019997_S`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 光が死んだ夏 (`.../KC_001571_S`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | 光が死んだ夏 (`.../KC_001571_S`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 101 |  第1話 (`.../viewer <redacted query values: episodeId and imageSizeType>`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 21 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 100 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=光が死んだ夏, URL=`.../KC_001571_S` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 151/151 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 151/151 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.comic-walker.com/.../coverImage_4969964.jpg` (image/jpeg, 22193 bytes, 350x498) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../KC_001571_S` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.comic-walker.com/.../coverImage_4969964.jpg` |  |  |  |
| details author | PASS | モクモクれん |  |  |  |
| details artist | PASS | モクモクれん |  |  |  |
| details genres | PASS | 女性, ホラー, 人外 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ある集落で暮らす少年、よしきと光。同い年の2人はずっと一緒に育ってきた。しかしある日、よしきが光だと思っていたものは別のナニカにすり替わっていたことに確信を持ってしまう。それでも、一緒にいたい。友人の姿をしたナニカとの、いつも通りの日々が始まる。時を同じくして、集落では様々な事件が起こっていき――。新進気鋭の作家・モクモクれんが描く、未知のナニカへ堕ちていく運命の物語、開幕。 |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 1 name, chapter 2 name, chapter 3 name, chapter 4 name, chapter 5 name, chapter 6 name, chapter 7 name, chapter 8 name, chapter 9 name, chapter 10 name, chapter 11 name, chapter 12 name, chapter 13 name, chapter 14 name, chapter 15 name, chapter 16 name, chapter 17 name, chapter 18 name, chapter 19 name, chapter 20 name, chapter 21 name, chapter 22 name, chapter 23 name, chapter 24 name, chapter 25 name, chapter 26 name, chapter 27 name, chapter 28 name, chapter 29 name, chapter 30 name, chapter 31 name, chapter 32 name, chapter 33 name, chapter 34 name, chapter 35 name, chapter 36 name, chapter 37 name, chapter 38 name, chapter 39 name, chapter 40 name, chapter 41 name, chapter 42 name, chapter 43 name, chapter 44 name, chapter 45 name, chapter 46 name, chapter 47 name, chapter 48 name, chapter 49 name, chapter 50 name, chapter 51 name, chapter 52 name, chapter 53 name, chapter 54 name, chapter 55 name, chapter 56 name, chapter 57 name, chapter 58 name, chapter 59 name, chapter 60 name, chapter 61 name, chapter 62 name, chapter 63 name, chapter 64 name, chapter 65 name, chapter 66 name, chapter 67 name, chapter 68 name, chapter 69 name, chapter 70 name, chapter 71 name, chapter 72 name, chapter 73 name, chapter 74 name, chapter 75 name, chapter 76 name, chapter 77 name, chapter 78 name, chapter 79 name, chapter 80 name, chapter 81 name, chapter 82 name, chapter 83 name, chapter 84 name, chapter 85 name, chapter 86 name, chapter 87 name, chapter 88 name, chapter 89 name, chapter 90 name, chapter 91 name, chapter 92 name, chapter 93 name, chapter 94 name, chapter 95 name, chapter 96 name, chapter 97 name, chapter 98 name, chapter 99 name, chapter 100 name, chapter 101 name |  |  |  |
| chapters | PASS | 101 chapters |  |  |  |
| chapter dates | PASS | 101 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 21 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.comic-walker.com/.../1_8c1f60186c0ab542fa5ee836e2b3119b8c841c788b825bca14353058191e2b27.webp <redacted query values: Policy, Signature, and Key-Pair-Id>` (image/webp (container: extended), 210928 bytes, 1284x1825; server Content-Type: application/octet-stream) |  |  |  |
