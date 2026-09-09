# Extension Validation Report

- Extension: tachiyomi-pt.mundohentai-v1.4.10
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 30
- Lint: 1
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 141171756957474060
- Source name: Mundo Hentai
- Source language: pt-BR
- Selected manga input: popular offset 0: [Doujinshi] Um Encontro Chato Com Minha Garota Durona e Seus Segredos Escondidos 2 (`.../um-encontro-chato-com-minha-garota-durona-e-seus-segredos-escondidos-2`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 15 | [Doujinshi] Um Encontro Chato Com Minha Garota Durona e Seus Segredos Escondidos 2 (`.../um-encontro-chato-com-minha-garota-durona-e-seus-segredos-escondidos-2`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 15 | [Doujinshi] Eu Ainda Te Amo ~ Minha Ex Virou uma Idol Gravure Peituda e Me Seduz com Sexo Adúltero (`.../eu-ainda-te-amo-minha-ex-virou-uma-idol-gravure-peituda-e-me-seduz-com-sexo-adultero`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 20 | [Doujinshi] Um Encontro Chato Com Minha Garota Durona e Seus Segredos Escondidos 2 (`.../um-encontro-chato-com-minha-garota-durona-e-seus-segredos-escondidos-2`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | [Doujinshi] Um Encontro Chato Com Minha Garota Durona e Seus Segredos Escondidos 2 (`.../um-encontro-chato-com-minha-garota-durona-e-seus-segredos-escondidos-2`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Capítulo (`.../um-encontro-chato-com-minha-garota-durona-e-seus-segredos-escondidos-2`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 50 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 15 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[Doujinshi\] Um Encontro Chato Com Minha Garota Durona e Seus Segredos Escondidos 2, URL=`.../um-encontro-chato-com-minha-garota-durona-e-seus-segredos-escondidos-2` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 50/50 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 50/50 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mundohentaioficial.com/.../001-1-241x334.jpg` (image/jpeg, 26964 bytes, 241x334) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../um-encontro-chato-com-minha-garota-durona-e-seus-segredos-escondidos-2` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mundohentaioficial.com/.../001-1.jpg` (image/jpeg, 403210 bytes, 1440x2013) |  |  |  |
| details author | PASS | Login Registre-se |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Biquíni, Boquete, Creampie, Gyaru, Óculos, Pau Grande, Peitões, Raio-X, Tomboy |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Cor: Preto e Branco |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 50 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://mundohentaioficial.com/.../001-1.jpg` (image/jpeg, 403210 bytes, 1440x2013) |  |  |  |
