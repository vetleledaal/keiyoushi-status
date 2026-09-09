# Extension Validation Report

- Extension: tachiyomi-en.elftoon-v1.4.34
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
- Source theme: mangathemesia
- Source ID: 3896703921896511395
- Source name: Elf Toon
- Source language: en
- Selected manga input: latest offset 0: Mysterious Revival: Starting with a Trillion Ghost Coins (`.../mysterious-revival-starting-with-a-trillion-ghost-coins`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | The Butcher Blade That Pierces All Realms (`.../the-butcher-blade-that-pierces-all-realms`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Apocalypse Heat: I Become a King with My Safehouse (`.../apocalypse-heat-i-become-a-king-with-my-safehouse`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Mysterious Revival: Starting with a Trillion Ghost Coins (`.../mysterious-revival-starting-with-a-trillion-ghost-coins`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | I Ushered in the Age of Mythical Pet Beasts (`.../i-ushered-in-the-age-of-mythical-pet-beasts`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Mysterious Revival: Starting with a Trillion Ghost Coins (`.../mysterious-revival-starting-with-a-trillion-ghost-coins`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Mysterious Revival: Starting with a Trillion Ghost Coins (`.../mysterious-revival-starting-with-a-trillion-ghost-coins`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 67 | Chapter 1 (`.../mysterious-revival-starting-with-a-trillion-ghost-coins-chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 8 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Mysterious Revival: Starting with a Trillion Ghost Coins, URL=`.../mysterious-revival-starting-with-a-trillion-ghost-coins` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i2.wp.com/.../420-7.jpg` (image/jpeg, 73713 bytes, 420x560) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../mysterious-revival-starting-with-a-trillion-ghost-coins` |  |  |  |
| details thumbnail URL | PASS | `https://i2.wp.com/.../420-7.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Fantasy, Manhua |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | In a strange post‑apocalyptic world, the protagonist Chen Mu is reborn with a trillion ghost coins in hand. From the very beginning he becomes a kind of “angel investor”: while others are fighting desperately over just a few ghost coins, Chen Mu is already buying up all kinds of eerie locations. While everyone else is still groping for survival within existing rules, he instead overturns the table and becomes the one who sets those rules. “You can even play the apocalypse like this?” Faced with such doubts, Chen Mu just curls his lips and says: “Relax—I’ve got this.<br><br>Alternative Names: 诡秘复苏：开局掌握万亿诡币 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 67 chapters |  |  |  |
| chapter dates | PASS | 67 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 8 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://elftoon.com/.../01-ohizr2mhhjeu.webp` (image/webp (container: extended), 2263880 bytes, 800x12840) |  |  |  |
