# Extension Validation Report

- Extension: tachiyomi-en.baetoon-v1.6.0
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6907136690809864188
- Source name: Baetoon
- Source language: en
- Selected manga input: popular offset 0: Revenge of the Baskerville Bloodhound (`.../6851547b702284f834178357`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Revenge of the Baskerville Bloodhound (`.../6851547b702284f834178357`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | The Legendary Hero is an Academy Honors Student (`.../685154f6702284f834178441`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | I Became the Owner of a Poor Estate (`.../6a6c0a5560aead3d24161424`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Longing and Lies (`.../68add95753c34263b62135b2`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Revenge of the Baskerville Bloodhound (`.../6851547b702284f834178357`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Revenge of the Baskerville Bloodhound (`.../6851547b702284f834178357`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 385 | Chapter 0 (`.../68d94b8937a9a19354db06de`) |  | <1s |
| pages | `getPageList(chapter)` | success | 18 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Revenge of the Baskerville Bloodhound, URL=`6851547b702284f834178357` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://bulbasaur.poke-black-and-white.net/.../cover_1752077533539.webp` (image/webp (encoding: lossy), 53820 bytes, 720x1030) |  |  |  |
| details identity | PASS | Details preserved selected URL `6851547b702284f834178357` |  |  |  |
| details thumbnail URL | PASS | `https://bulbasaur.poke-black-and-white.net/.../cover_1752077533539.webp` |  |  |  |
| details author | PASS | Seol Arang, Legobalbasseo, Lee Sanchaek, REDICE Studio (레드아이스 스튜디오) |  |  |  |
| details artist | PASS | Seol Arang, Legobalbasseo, Lee Sanchaek, REDICE Studio (레드아이스 스튜디오) |  |  |  |
| details genres | PASS | Manhwa, Time Travel, Action, Long Strip, Adventure, Magic, Harem, Fantasy, Mystery, Adaptation, Full Color, Webtoon, Betrayal, Revenge, Time Skip, Based on a Novel, Demon/s, Strong Female Lead, Swordsman, Smart Male Lead, Monster/s, Young Male Lead, Coming of Age, Blood and Gore, Slave/s, Torture, Cool Male Lead, Dark Ambience, Female Lead Falls in Love First, Sword/s, Handsome Male Lead, Family Rivals, Kidnapping/s, Cannibalism, Muscular Female/s, Fantasy World, Enemies Become Allies, Scary Male Lead, Talented Female Lead, Muscular Male Lead, Academy, Martial Artist/s, Dark Fantasy, Slavery, Cliches, Age Progression, Male Protagonist, Annoying Character/s, Time Rewind, Necromancy, Based on a Web Novel, Hiding True Identity, Survival of the Fittest, Strong Father, Red-Eyed Male Lead, European Ambience, Regression, Dysfunctional Family/ies, Half-Sibling/s, Based on a Korean Novel, Sword and Sorcery/Magic, Nobility/Aristocracy, Regressed Male Lead, Regressor Protagonist, Slave Auction, Sibling/s, Age Regression, Swordplay, Female Harem, Arranged Engagement, Bad Parent/s, Barbarian/s, Beautiful Female Lead, Blood-Thirsty Male Lead, Changing Fate, Character Development, Child Abuse, Child Born From Rape, Collar/s, Cruel Character/s, Cunning Male Lead, Cunning Protagonist, Disease, Dominant Female Lead, Genocide, Harem Subtext, Hiding Power/s, Mage/s, Multiple Love Interests, Mystical Weapon/s, Plain-Looking Male Lead, Plain-Looking Protagonist, Plot Twist, Rape, Rapist/s, Regret, Returnee, Romantic Subplot, Ruthless Male Lead, Sadistic Male Lead, Sex Slave/s, Strong Family, Strong Protagonist, Strong to Overpowered, Succession, Triplets |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 2023<br><br>Raised to kill like a pack of loyal hounds, the Baskerville children took countless lives as a band of fearsome assassins.<br><br>Despite being the shunned illegitimate son of the brood, Vikir served his family faithfully, only to meet his untimely demise at his father’s hands. But when he is inexplicably reborn with a second chance at life, Vikir, armed with the memories and knowledge of his past, swears to rise above the pack and take his revenge.<br><br>This time, he's ready to bite the hand that feeds.<br><br>**Alternative Names:**<br>- 철혈검가 사냥개의 회귀<br>- Cheolhyeolgeomga Sanyanggaeui Hoegwi<br>- Revenge of the Sword Clan's Hound<br>- Revenge of the Iron-Blooded Sword Hound<br>- Regression of the Ironblade Hound<br>- Return of the Iron-Blooded Hound<br>- Return of the Iron-Blooded Sword Hound<br>- The Return of the Iron-Blood Sword Hound |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 385 chapters |  |  |  |
| chapter dates | PASS | 385 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 18 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | First page URL `https://bulbasaur.poke-black-and-white.net/.../68d94b8937a9a19354db06de-001.webp` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
