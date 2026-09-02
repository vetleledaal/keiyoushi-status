# Extension Validation Report

- Extension: tachiyomi-en.nyxscans-v1.6.31
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 419822582289753882
- Source name: Nyx Scans
- Source language: en
- Selected manga input: popular offset 0: Operation: True Love (`.../operation-true-love`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 17 | Operation: True Love (`.../operation-true-love`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 16 | Press Play, Sami (`.../press-play-sami`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 187 | 1st in Class Hides Regression (`.../1st-in-class-hides-regression`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 18 | I will save my father (`.../i-will-save-my-father`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Operation: True Love (`.../operation-true-love`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Operation: True Love (`.../operation-true-love`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 144 | Chapter 0 - Prologue (`.../chapter-0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 82 |  |  | <1s |

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
| popular listing | PASS | 17 entries |  |  |  |
| latest listing | PASS | 187 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Operation: True Love, URL=`operation-true-love#9` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=I will save my father, URL=`i-will-save-my-father#692` at page 1 offset 17 and page 2 offset 0, title=A Peaceful Maid Life While Hiding My True Power, URL=`a-peaceful-maid-life-while-hiding-my-true-power#616` at page 1 offset 18 and page 2 offset 1, title=I Faked a Pregnancy, but My Husband Returned, URL=`i-faked-a-pregnancy-but-my-husband-returned#632` at page 1 offset 19 and page 2 offset 2, title=Like Father, Like Daughter, URL=`like-father-like-daughter#59` at page 1 offset 20 and page 2 offset 3, title=The Maid With a Child, URL=`the-maid-with-a-child#805` at page 1 offset 21 and page 2 offset 4, title=This Emperor Is Running a Marriage Scam, URL=`this-emperor-is-running-a-marriage-scam#675` at page 1 offset 22 and page 2 offset 5, title=About Perfect Revenge, URL=`about-perfect-revenge#721` at page 1 offset 23 and page 2 offset 6, title=Looking for the Villainess’s Contract Husband, URL=`looking-for-the-villainess's-contract-husband#732` at page 1 offset 24 and page 2 offset 7, title=The Forgotten Field, URL=`the-forgotten-field#686` at page 1 offset 25 and page 2 offset 8, title=The Reason Why That Villainess Picked Up A Sword, URL=`the-reason-why-that-villainess-picked-up-a-sword#220` at page 1 offset 26 and page 2 offset 9, title=You Will Pay With Your Life For Deceiving Me, URL=`you-will-pay-with-your-life-for-deceiving-me#167` at page 1 offset 27 and page 2 offset 10, title=The Pearl of Albrecht, URL=`the-pearl-of-albrecht#601` at page 1 offset 28 and page 2 offset 11, title=A Guaranteed Solution, URL=`a-guaranteed-solution#809` at page 1 offset 29 and page 2 offset 12, title=The Calamity Prince Wants the Fake Princess, URL=`the-calamity-prince-wants-the-fake-princess#803` at page 1 offset 30 and page 2 offset 13, title=I'm a Sickly Mother, But I'll Raise My Villainous Son!, URL=`i'm-a-sickly-mother-but-i'll-raise-my-villainous-son!#663` at page 1 offset 31 and page 2 offset 14, title=Don’t Be Obsessed, Please Divorce!, URL=`don't-be-obsessed-please-divorce!#401` at page 1 offset 32 and page 2 offset 15, title=Marriage Defense Scandal, URL=`marriage-defense-scandal#638` at page 1 offset 33 and page 2 offset 16, title=I Became A Married Man in Another World, URL=`i-became-a-married-man-in-another-world#681` at page 1 offset 34 and page 2 offset 17 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 239/239 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 239/239 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://media.nyxscans.com/.../b5196bdc-ede4-43c7-87cc-073710686042.webp` (image/webp (encoding: lossy), 130724 bytes, 480x623) |  |  |  |
| details identity | PASS | Details preserved selected URL `operation-true-love#9` |  |  |  |
| details thumbnail URL | PASS | `https://media.nyxscans.com/.../b5196bdc-ede4-43c7-87cc-073710686042.webp` |  |  |  |
| details author | PASS | kkokkalee |  |  |  |
| details artist | PASS | Dledumb |  |  |  |
| details genres | PASS | Manhwa, Webtoon |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | It’s hard dating someone who won’t give you the time of day. Su-ae Shim knows that better than anyone, having dated her indifferent boyfriend, Minu Kang, for years. She sometimes wishes she could be more like her charismatic stepsister, Ra-im, who seems to have it all. But life takes a turn for the weird when Su-ae discovers Jellypop, a sentient flip phone, in her locker. Jellypop has a lot to say about her love life, especially as Su-ae drifts further away from Minu and finds herself running into Minu’s friend, Eunhyeok. Add to the mix a growing suspicion that Minu and Ra-im might be more than friends, and Su-ae might need a miracle to navigate the ups and downs of high school romance!<br><br>Alternative Names: Operation: True Love, Operation Name Pure Love, Pure Love Operation, 작전명 순정 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 144 chapters |  |  |  |
| chapter dates | PASS | 144 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 82 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://media.nyxscans.com/.../image_1_f8699722.webp` (image/webp (encoding: lossy), 89002 bytes, 800x1000) |  |  |  |
