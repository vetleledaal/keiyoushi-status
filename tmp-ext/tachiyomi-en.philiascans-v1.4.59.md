# Extension Validation Report

- Extension: tachiyomi-en.philiascans-v1.4.59
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
- Source ID: 5404809838386240671
- Source name: Philia Scans
- Source language: en
- Selected manga input: latest offset 0: I Reincarnated as a Minor Villainess, so Why Is the Tyrant Marquis Doting on Me?! (`.../i-reincarnated-as-a-minor-villainess-so-why-is-the-tyrant-marquis-doting-on-me`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | I Reincarnated as the Villainous Noble in an Otome Game, So I Tried Buying the Main Heroine with the Power of Money (`.../i-reincarnated-as-the-villainous-noble-in-an-otome-game-so-i-tried-buying-the-main-heroine-with-the-power-of-money`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | The Assassin Wants to Kill the Immortal Witch (`.../the-assassin-wants-to-kill-the-immortal-witch`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | I Reincarnated as a Minor Villainess, so Why Is the Tyrant Marquis Doting on Me?! (`.../i-reincarnated-as-a-minor-villainess-so-why-is-the-tyrant-marquis-doting-on-me`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Dominating Another World with Mind Control Skill (`.../dominating-another-world-with-mind-control-skill`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | I Reincarnated as a Minor Villainess, so Why Is the Tyrant Marquis Doting on Me?! (`.../i-reincarnated-as-a-minor-villainess-so-why-is-the-tyrant-marquis-doting-on-me`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | I Reincarnated as a Minor Villainess, so Why Is the Tyrant Marquis Doting on Me?! (`.../i-reincarnated-as-a-minor-villainess-so-why-is-the-tyrant-marquis-doting-on-me`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 3 | Chapter 1 (`.../chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 53 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=I Reincarnated as a Minor Villainess, so Why Is the Tyrant Marquis Doting on Me?!, URL=`i-reincarnated-as-a-minor-villainess-so-why-is-the-tyrant-marquis-doting-on-me` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Forgery of Naomi, URL=`forgery-of-naomi` at page 1 offset 19 and page 2 offset 19 |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://philiascans.org/.../41fa3dde2f5bcaf4.jpg <redacted query values: token, expires, and v>` (image/webp (encoding: lossy), 299986 bytes, 1053x1500) |  |  |  |
| details identity | PASS | Details preserved selected URL `i-reincarnated-as-a-minor-villainess-so-why-is-the-tyrant-marquis-doting-on-me` |  |  |  |
| details thumbnail URL | PASS | `https://philiascans.org/.../41fa3dde2f5bcaf4.jpg <redacted query values: token, expires, and v>` |  |  |  |
| details author | PASS | Miyako Natsume |  |  |  |
| details artist | PASS | Anago Chin |  |  |  |
| details genres | PASS | Josei, Romance, Comedy, Drama, Isekai, Reincarnation |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | The protagonist wakes up to find herself reincarnated as Lariat, the villainess from her favorite romance novel in her past life! Determined to avoid her tragic fate at the hands of the handsome yet tyrannical Marquis Zeronis, Lariat uses her memories to secretly take a job as a maid in his mansion. Unfortunately, she ends up appointed as Zeronis’s personal “tea server”...!? Now she must keep her true identity hidden, but the possessive Marquis seems to be getting far too close for comfort!<br><br>Alternative Titles:<br>- Akuyaku Reijo ni Tensei Shita Watashi ga<br>- Nazeka Bokun Koshaku ni Dekiai Sareterun Desukedo<br>- 悪役令嬢に転生した私が、なぜか暴君侯爵に溺愛されてるんですけど<br>- I Reincarnated as the Villainess<br>- but the Tyrant Duke Won't Stop Spoiling Me |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | PASS | 3 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 53 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://media.philiascans.org/.../907d9e3b527e217a_s.webp <redacted query values: token, expires, and v>` (image/webp (encoding: lossy), 293088 bytes, 3360x1440) |  |  |  |
