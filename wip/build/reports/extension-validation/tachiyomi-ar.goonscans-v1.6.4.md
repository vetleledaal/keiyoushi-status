# Extension Validation Report

- Extension: tachiyomi-ar.goonscans-v1.6.4
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 0
- Warnings: 3
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 2899371341317171497
- Source name: Goon Scans
- Source language: ar
- Selected manga input: popular offset 0: The Witches of Adamas (`.../the-witches-of-adamas`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | The Witches of Adamas (`.../the-witches-of-adamas`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Operation Water Ghost (`.../operation-water-ghost`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | The Rib of Adam (`.../the-rib-of-adam`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | love potion panic (`.../love-potion-panic`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Witches of Adamas (`.../the-witches-of-adamas`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Witches of Adamas (`.../the-witches-of-adamas`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 40 | الفصل 1.1 (`.../the-witches-of-adamas-%D8%A7%D9%84%D9%81%D8%B5%D9%84-1-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 16 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Witches of Adamas, URL=`.../the-witches-of-adamas` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Operation Water Ghost, URL=`.../operation-water-ghost` at page 1 offset 8 and page 2 offset 0, title=Portrait of pride, URL=`.../portrait-of-pride` at page 1 offset 9 and page 2 offset 1, title=فك ربطي قبل أن تتأذى, URL=`.../%D9%81%D9%83-%D8%B1%D8%A8%D8%B7%D9%8A-%D9%82%D8%A8%D9%84-%D8%A3%D9%86-%D8%AA%D8%AA%D8%A3%D8%B0%D9%89` at page 1 offset 10 and page 2 offset 2, title=I Love Older Women, URL=`.../i-love-older-women` at page 1 offset 11 and page 2 offset 3, title=Predatory marriage, URL=`.../predatory-marriage` at page 1 offset 12 and page 2 offset 4, title=The End in the Fall, URL=`.../the-end-in-the-fall` at page 1 offset 13 and page 2 offset 5, title=Kedamono-tachi no Jikan: Kyou Izonshoukougun, URL=`.../kedamono-tachi-no-jikan-kyou-izonshoukougun` at page 1 offset 14 and page 2 offset 6, title=Serie MILF NTR, URL=`.../serie-milf-ntr` at page 1 offset 15 and page 2 offset 7, title=Kanojo ga Harem o Susumetekuru․, URL=`.../kanojo-ga-harem-o-susumetekuru%E2%80%A4` at page 1 offset 16 and page 2 offset 8, title=How to Escape the Sultan’s Clutches, URL=`.../how-to-escape-the-sultans-clutches` at page 1 offset 17 and page 2 offset 9, title=Having an Affair with My Blonde Bombshell Boss, URL=`.../having-an-affair-with-my-blonde-bombshell-boss` at page 1 offset 18 and page 2 offset 10, title=Clover Days, URL=`.../clover-days` at page 1 offset 19 and page 2 offset 11, title=milf exchange plan, URL=`.../milf-exchange-plan` at page 1 offset 20 and page 2 offset 12, title=Public Place Open XX Collection, URL=`.../public-place-open-xx-collection` at page 1 offset 21 and page 2 offset 13, title=Not Sober, URL=`.../not-sober` at page 1 offset 22 and page 2 offset 14, title=Act out!, URL=`.../act-out` at page 1 offset 23 and page 2 offset 15 |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Fun with femboy, URL=`.../fun-with-femboy` at page 1 offset 12 and page 2 offset 1, title=The Hero Took Everything from Me, URL=`.../the-hero-took-everything-from-me` at page 1 offset 13 and page 2 offset 2, title=Tears on a Withered Flower, URL=`.../tears-on-a-withered-flower` at page 1 offset 14 and page 2 offset 3, title=love potion panic, URL=`.../love-potion-panic` at page 1 offset 16 and page 2 offset 0, title=Wild night, URL=`.../wild-night-2` at page 1 offset 17 and page 2 offset 7, title=Lex Talionis, URL=`.../lex-talionis` at page 1 offset 18 and page 2 offset 8, title=On My Birthday, Five Husbands Appeared, URL=`.../on-my-birthday-five-husbands-appeared` at page 1 offset 19 and page 2 offset 9, title=Simple yet sexy, URL=`.../simple-yet-sexy` at page 1 offset 20 and page 2 offset 4, title=Surrounded by moving company employees, URL=`.../surrounded-by-moving-company-employees` at page 1 offset 21 and page 2 offset 5, title=A Young Wife and Bad Deeds, URL=`.../a-young-wife-and-bad-deeds` at page 1 offset 22 and page 2 offset 6, title=The Sinister Pervert Next Door, URL=`.../the-sinister-pervert-next-door` at page 1 offset 23 and page 2 offset 12 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://goonscans.org/.../The-Witches-vol.-03-part-1_20240620223301-210x300.png` (image/png, 106882 bytes, 210x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-witches-of-adamas` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://goonscans.org/.../The-Witches-vol.-03-part-1_20240620223301.png` (image/png, 3863186 bytes, 1403x2000) |  |  |  |
| details author | PASS | IMAI Yuu |  |  |  |
| details artist | PASS | IMAI Yuu |  |  |  |
| details genres | PASS | Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ساتو يوكيناري لديه حالة غريبة جدًا: يقذف الألماس. مع أن هذه الألماسات المميزة تساوي ثروة طائلة، وقد يصل إلى ذروة النشوة ليُصبح ثريًا، إلا أن لها ثمنًا باهظًا. كل ألماسة تكلفه عامًا كاملًا من حياته. علاوة على ذلك، جذبت حالته حشدًا من الساحرات الجميلات الفاتنات اللواتي يردن الحصول على أحجاره الثمينة، مهما كلفه ذلك. شاهد يوكيناري وهو يحاول التغلب على إغراء مثير ولكنه قاتل في هذه الكوميديا الجريئة والجريئة.<br><br>**Alternative Names:**<br>- Adamas Witches, The Witches of Adamas, アダマスの魔女たち, 钻石魔女们, 阿达曼石的魔女们, 아다마스의 마녀들, Adamasu no Majotachi, ساحرات الألماس |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 40 chapters |  |  |  |
| chapter dates | PASS | 40 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://goonscans.org/.../01.webp` (image/webp (encoding: lossy), 268640 bytes, 1403x2000) |  |  |  |
