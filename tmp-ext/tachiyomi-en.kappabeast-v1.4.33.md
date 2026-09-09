# Extension Validation Report

- Extension: tachiyomi-en.kappabeast-v1.4.33
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2598579144085032375
- Source name: Kappa Beast
- Source language: en
- Selected manga input: latest offset 0: Baka Deka Imōto ga Yatte Kuru! (`.../Baka-Deka-Imoto-ga-Yatte-Kuru`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | 'Ano Toki Tasukete Itadaita Monster Musume desu.' Isekai Ossan Kyoushi Totsuzen no Moteki ni Konwaku suru (`.../ano-toki-tasukete-itadaita-monster-musume-desu-isekai-ossan-kyoushi-totsuzen-no-moteki-ni-konwaku-suru`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 1 | Majo no Danna no Tsukurikata (`.../Majo-no-Danna-no-Tsukurikata`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Baka Deka Imōto ga Yatte Kuru! (`.../Baka-Deka-Imoto-ga-Yatte-Kuru`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 1 | Ane Kui Yuusha to Teisou Gyakuten Teikoku no Onee-chan! (`.../ane-kui-yuusha-to-teisou-gyakuten-teikoku-no-onee-chan`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Baka Deka Imōto ga Yatte Kuru! (`.../Baka-Deka-Imoto-ga-Yatte-Kuru`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Baka Deka Imōto ga Yatte Kuru! (`.../Baka-Deka-Imoto-ga-Yatte-Kuru`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 2 | Chapter 1 (`.../1.0`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 31 |  |  | <1s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Baka Deka Imōto ga Yatte Kuru!, URL=`Baka-Deka-Imoto-ga-Yatte-Kuru#o7ixcwi5e0nxkl2e74gchee9` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 43/43 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 43/43 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://strapi.kappabeast.com/.../big_sister_06c2c4407e.png` (image/png, 339816 bytes, 836x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `Baka-Deka-Imoto-ga-Yatte-Kuru#o7ixcwi5e0nxkl2e74gchee9` |  |  |  |
| details thumbnail URL | PASS | `https://strapi.kappabeast.com/.../big_sister_06c2c4407e.png` |  |  |  |
| details author | PASS | Kaiki Sasaki |  |  |  |
| details artist | PASS | Kaiki Sasaki |  |  |  |
| details genres | PASS | romcom, School Life, Ecchi, Harem, Slice of Life, Comedy |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | I, Kasuka Nagasu, have a sister named Kujira Nagasu who is two years younger than me.<br><br>Today is the day I reunite with Kujira for the first time in five years—ever since our parents were transferred overseas. In my mind, she was still that tiny girl from back then...<br><br>I hear Kujira calling out my name.<br>I wonder if she's grown a little...<br><br>Wait—<br>SHE'S TOO BIG!!!!<br>She's gotten insanely huge!<br>She's carrying a rolling suitcase like it's a handbag!!!<br><br>—And so begins the sibling comedy woven by these two!!!! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | PASS | 2 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 31 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../1.jpg` (image/jpeg, 469031 bytes, 1115x1600) |  |  |  |
