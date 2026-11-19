# Extension Validation Report

- Extension: tachiyomi-en.kaynscans-v1.6.40
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: vinetheme
- Source ID: 6622233282902198923
- Source name: Kayn Scans
- Source language: en
- Selected manga input: popular offset 0: The Second Eunuch Regains His Manhood (`.../kayn-s-167`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | The Second Eunuch Regains His Manhood (`.../kayn-s-167`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Genius Grandson Of The Loan Shark King (`.../kayn-s-30`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Solo Swordmaster (`.../cmuo574fw0jeyj6s8746zc8k2`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Counterattack of the Ugly Orcs (`.../kayn-s-264`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Second Eunuch Regains His Manhood (`.../kayn-s-167`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Second Eunuch Regains His Manhood (`.../kayn-s-167`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 111 | Chapter 1 (`.../kayn-c-8003`) |  | <1s |
| pages | `getPageList(chapter)` | success | 36 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Second Eunuch Regains His Manhood, URL=`kayn-s-167` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://kaynscans.com/.../40290dcc8d8a736d462186acf04920f5.png` (image/png, 892884 bytes, 800x1038) |  |  |  |
| details identity | PASS | Details preserved selected URL `kayn-s-167` |  |  |  |
| details thumbnail URL | PASS | `https://kaynscans.com/.../40290dcc8d8a736d462186acf04920f5.png` |  |  |  |
| details author | PASS | Kayn Scans |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | MANHWA, KOREAN, Action, Adventure, Comedy, Fantasy, Harem, Historical, Martial Arts, Romance, Seinen, Shounen, Supernatural, Regression |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | The eunuch Lee Cheolsu, a secret power figure who controls the affairs of the empire at will. He possesses absolute power, wealth, and even strong martial arts skills… but what does that mean? If he can’t “do that”!! Through a reincarnation technique, Cheolsu returns to the time before he became a eunuch. He has one goal in mind: to become an alpha male and enjoy life with the most beautiful women!!<br><br>Rating: 8.2<br>Type: MANHWA<br>Origin: KOREAN<br><br>**Alternative titles:**<br>- 2회차 환관이 남성을 되찾음<br>- Eunuch Regains His Manhood<br>- The Eunuch Regains His Manhood in His Second Life<br>- The Eunuch's Rebirth: A Journey Back to Manhood<br>- The Eunuch's Return<br>- พอแล้วขันที อยากมีเจ้าโลก<br>- 転生宦官はハーレムしたい<br>- 轉世宦官重振雄風 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 111 chapters |  |  |  |
| chapter dates | PASS | 111 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 36 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://kaynscans.com/.../the-second-eunuch-regains-his-manhood <redacted query values: sort>` to `https://kaynscans.com/.../the-second-eunuch-regains-his-manhood <redacted query values: sort and _rsc>` (1 redirects); popular: `https://kaynscans.com/.../the-second-eunuch-regains-his-manhood <redacted query values: sort>` to `https://kaynscans.com/.../the-second-eunuch-regains-his-manhood <redacted query values: sort and _rsc>` (1 redirects); popular: `https://kaynscans.com/.../the-second-eunuch-regains-his-manhood <redacted query values: sort and page>` to `https://kaynscans.com/.../the-second-eunuch-regains-his-manhood <redacted query values: sort, page, and _rsc>` (1 redirects); popular: `https://kaynscans.com/.../1` to `https://kaynscans.com/.../1 <redacted query values: _rsc>` (1 redirects) |  |  |  |
| page load | PASS | `https://kaynscans.com/.../p0001.webp` (image/webp (encoding: lossy), 946808 bytes, 800x8000) |  |  |  |
