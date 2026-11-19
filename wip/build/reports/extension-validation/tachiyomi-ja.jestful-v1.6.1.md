# Extension Validation Report

- Extension: tachiyomi-ja.jestful-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7655990874385542347
- Source name: Jestful
- Source language: ja
- Selected manga input: popular offset 0: Kimetsu No Yaiba - Raw (`.../hwms-kimetsu-no-yaiba-raw.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Kimetsu No Yaiba - Raw (`.../hwms-kimetsu-no-yaiba-raw.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Tsuki Ga Michibiku Isekai Douchuu - Raw (`.../hwms-tsuki-ga-michibiku-isekai-douchuu-raw.html`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Danzai Sareru Koushaku Reijou, Umarekawatte Last Boss No Ouhi-Sama No Kodomo Ni Narimasu (`.../hwms-danzai-sareru-koushaku-reijou-umarekawatte-last-boss-no-ouhi-sama-no-kodomo-ni-narimasu.html`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Yakume Wo Oeta Akuyaku Reisoku Wa, Dainino Jinsei De Norowareta Reitetsu Koushaku Ni Misomeraremashita (`.../hwms-yakume-wo-oeta-akuyaku-reisoku-wa-dainino-jinsei-de-norowareta-reitetsu-koushaku-ni-misomeraremashita.html`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Kimetsu No Yaiba - Raw (`.../hwms-kimetsu-no-yaiba-raw.html`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Kimetsu No Yaiba - Raw (`.../hwms-kimetsu-no-yaiba-raw.html`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 148 | Chapter 12 (`.../bsaq-kimetsu-no-yaiba-raw-chapter-12.html`) |  | <1s |
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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kimetsu No Yaiba - Raw, URL=`.../hwms-kimetsu-no-yaiba-raw.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://j4.jfimv2.xyz/.../6131f75a99389_6131f75af070c.jpg` (image/jpeg, 84484 bytes, 150x236) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../hwms-kimetsu-no-yaiba-raw.html` |  |  |  |
| details thumbnail URL | PASS | `https://j4.jfimv2.xyz/.../6131f75a99389_6131f75af070c.jpg` |  |  |  |
| details author | PASS | GOTOUGE Koyoharu |  |  |  |
| details artist | PASS | GOTOUGE Koyoharu |  |  |  |
| details genres | PASS | Adventure, Fantasy, Historical, Shounen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Tanjiro is the oldest son in his family who has lost his father. One day, Tanjiro ventures off to another town to sell charcoal. Instead of going home, he ends up staying the night at someone else?s house due to rumors of a demon nearby in the mountains. When he gets home the following day, a terrible tragedy awaits him.<br><br>★★★✬☆ 3.7 (542)<br>**Followers:** 253 · **Magazine:** Weekly Shonen Jump · **Views:** 12,691,751 · **Year:** 2000<br><br>**Associated Name(s):**<br>- 鬼滅の刃 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 148 chapters |  |  |  |
| chapter dates | PASS | 148 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://j4.jfimv2.xyz/.../5fccccf230c6f_5fccccf46c08d.jpg` (image/jpeg, 249969 bytes, 764x1200) |  |  |  |
