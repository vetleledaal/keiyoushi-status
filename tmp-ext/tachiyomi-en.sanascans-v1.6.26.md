# Extension Validation Report

- Extension: tachiyomi-en.sanascans-v1.6.26
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1931508394363321246
- Source name: Sana Scans
- Source language: en
- Selected manga input: popular offset 0: Surprisingly Fun New Life of a Divorced Lady Who Is No Longer Interested (`.../surprisingly-fun-new-life-of-a-divorced-lady-who-is-no-longer-interested`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Surprisingly Fun New Life of a Divorced Lady Who Is No Longer Interested (`.../surprisingly-fun-new-life-of-a-divorced-lady-who-is-no-longer-interested`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | I Failed to Become a Saint, but Even Hiding Quietly Still Causes Trouble. (`.../i-failed-to-become-a-saint-but-even-hiding-quietly-still-causes-trouble.`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | Killed by My Fiancé, Reborn to My Father the Duke’s Love — This Time I’ll Be Happy! (`.../killed-by-my-fiance-reborn-to-my-father-the-duke's-love-this-time-i'll-be-happy!`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 30 | I  Married in My Sister’s Place, but I’m the True Saintess! (`.../i-married-in-my-sister's-place-but-i'm-the-true-saintess!`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Surprisingly Fun New Life of a Divorced Lady Who Is No Longer Interested (`.../surprisingly-fun-new-life-of-a-divorced-lady-who-is-no-longer-interested`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Surprisingly Fun New Life of a Divorced Lady Who Is No Longer Interested (`.../surprisingly-fun-new-life-of-a-divorced-lady-who-is-no-longer-interested`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 29 | Chapter 1 (`.../chapter-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 40 |  |  | <1s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Surprisingly Fun New Life of a Divorced Lady Who Is No Longer Interested, URL=`surprisingly-fun-new-life-of-a-divorced-lady-who-is-no-longer-interested#8` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://storage.sanascans.com/.../b6fd5ed3-e45f-4833-9bee-c8309057166f.webp` (image/webp (encoding: lossy), 149226 bytes, 500x709) |  |  |  |
| details identity | PASS | Details preserved selected URL `surprisingly-fun-new-life-of-a-divorced-lady-who-is-no-longer-interested#8` |  |  |  |
| details thumbnail URL | PASS | `https://storage.sanascans.com/.../b6fd5ed3-e45f-4833-9bee-c8309057166f.webp` |  |  |  |
| details author | PASS | IZUMI Kyouka |  |  |  |
| details artist | PASS | Sabinobuchi |  |  |  |
| details genres | PASS | Manga, Shoujo, Drama , Romance, Josei |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Vera is the wife of Carol, the crown prince, and as such has always put her utmost effort into her marital and royal responsibilities... But then one day, he tells her that he's no longer interested in her and is getting a divorce! Banished to a remote region, she begins to enjoy her newfound freedom to its fullest now that she has been released from training to become queen and the official duties she could never get fully accustomed to. As she does so, the former Prince Alan comes to visit her, and notices a certain change around her residence...?<br><br>Alternative Names: Surprisingly Fun New Life of a Divorced Lady Who Is No Longer Interested, Una joven que se divorció porque ya no estaba interesada en ella tiene una vida sorprendentemente divertida |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 29 chapters |  |  |  |
| chapter dates | PASS | 29 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 40 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://storage.sanascans.com/.../01%20copy.webp` (image/webp (encoding: lossy), 585052 bytes, 1284x1825) |  |  |  |
