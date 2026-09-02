# Extension Validation Report

- Extension: tachiyomi-id.ngamenkomik-v1.6.15
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 29
- Lint: 2
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4607768416266139943
- Source name: NgamenKomik
- Source language: id
- Selected manga input: popular offset 0: Webtoon Character Na Kang Lim (`.../webtoon-character-na-kang-lim_9.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 9 | Webtoon Character Na Kang Lim (`.../webtoon-character-na-kang-lim_9.html`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 13 | Xuanmen Prodigal Son (`.../xuanmen-prodigal-son.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Webtoon Character Na Kang Lim (`.../webtoon-character-na-kang-lim_9.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Webtoon Character Na Kang Lim (`.../webtoon-character-na-kang-lim_9.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 123 | Chapter 50 (`.../chapter-00.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 12 |  |  | 1-10s |

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
| popular listing | PASS | 9 entries |  |  |  |
| latest listing | PASS | 13 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Webtoon Character Na Kang Lim, URL=`.../webtoon-character-na-kang-lim_9.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 23/23 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 23/23 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../%EC%88%98%EC%9A%94%EC%9B%B9%ED%88%B0%EC%9D%98%20%EB%82%98%EA%B0%95%EB%A6%BC.jpg` (image/jpeg, 19880 bytes, 154x200) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../webtoon-character-na-kang-lim_9.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://blogger.googleusercontent.com/.../%EC%88%98%EC%9A%94%EC%9B%B9%ED%88%B0%EC%9D%98%20%EB%82%98%EA%B0%95%EB%A6%BC.jpg` (image/jpeg, 161043 bytes, 480x623) |  |  |  |
| details author | PASS | Lee kyung-min, Song Joonhyuk |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Romance, School Life, Shounen |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Na Kang-Lim, seorang siswa SMA yang biasanya menikmati webtoon. Suatu hari, mengalami hal yang aneh, seorang protagonis wanita dari webtoon yang biasa dia baca muncul di hadapannya. Kejadian-kejadian dalam webtoon tersebut membuatnya mengalami krisis, tetapi masalahnya adalah tidak ada protagonis |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 117 name |  |  |  |
| chapters | PASS | 123 chapters |  |  |  |
| chapter dates | PASS | 123 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 12 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../000.jpg` (image/jpeg, 360131 bytes, 1600x1200) |  |  |  |
